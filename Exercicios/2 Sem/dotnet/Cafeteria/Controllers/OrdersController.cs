using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using Cafeteria.Data;
using Cafeteria.Models;

namespace Cafeteria.Controllers
{
    public class OrdersController : Controller
    {
        private readonly CafeteriaContext _context;

        public OrdersController(CafeteriaContext context)
        {
            _context = context;
        }

        // GET: Orders
        public async Task<IActionResult> Index()
        {
            return View(await _context.Order.ToListAsync());
        }

        // GET: Orders/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var order = await _context.Order.FindAsync(id);

            List<ProductViewOrderDetail> itemsOfOrder = new List<ProductViewOrderDetail>();
            
            List<OrderItem> orderItem = await _context.OrderItem.Where(idO => idO.IdOrder == id).ToListAsync();
            
            foreach (var item in orderItem)
            {
                var product = await _context.Product.FindAsync(item.IdProduct);

                itemsOfOrder.Add(new ProductViewOrderDetail
                {
                    Name = product.Name,
                    Category = product.Category,
                    Quantity = item.Quantity,
                    Price = product.Price,
                    SubTotal = product.Price * item.Quantity
                });
            }
            var viewModel = new OrderDetailsViewModel
            {
                Order = order,
                ItemsOfOrder = itemsOfOrder
            };

            if (order == null)
            {
                return NotFound();
            }
            
            return View(viewModel);
        }

        // GET: Order/Create
        public async Task<IActionResult> Create()
        {   
            // Recupera todos os produtos do BD
            var products = await _context.Product.ToListAsync();
            // Seleciona apenas os produtos cujo atributo Quantidade é diferente de zero
            products = products.Where(p => p.Quantity!=0).ToList();
        
        		// Instancia uma nova ViewModel
            OrderCreateViewModel viewModel = new OrderCreateViewModel
            {
                ProductsSelectList = products.Select(p => new SelectListItem 
                {
                    Value = p.Id.ToString(),
                    Text = p.Name
                }),
                Products = products
            };
        
        		// Limpa os dados temporários
            TempData.Clear();
            
            return View(viewModel);
        }

        [HttpPost]
        public async Task<ActionResult> AddProduct (OrderCreateViewModel viewModel)
        { 
            // Recupera todos os produtos do BD
            var products = await _context.Product.ToListAsync();
            // Seleciona apenas os produtos cujo atributo Quantidade é diferente de zero
            products = products.Where(p => p.Quantity!=0).ToList();
            
            // Valida se a consulta ao banco teve sucesso
            if(products==null)
                return NotFound();
        
            // Valida se o produto selecionado pelo usuário no dropdown foi encontrado no BD
            Product? stockCheck = products.Find(p=>p.Id==viewModel.SelectedProductId);
            if(stockCheck==null)
                return NotFound();
            
            // Verifica se a quantidade solicitada no produto e suficiente no estoque
            if(stockCheck.Quantity >= viewModel.Quantity)
            {
                TempData[viewModel.SelectedProductId.ToString()]=viewModel.Quantity;
            }else
            {
                viewModel.Message = "There are not enough products in stock.";
            }
            
            viewModel.TotalPrice = 0;
        
            // Salva os dados do produto selecionado em TempData para a próxima seção
            foreach (var key in TempData.Keys)
            {
                TempData.Keep(key);
                
                Product ?p = products.Find(p => p.Id == int.Parse(key));
                string ?q = TempData[key]?.ToString();
                if (p != null && q!=null)
                    viewModel.TotalPrice += p.Price * int.Parse(q);
            }
        
            // Reabastece a lista de produtos para o dropdown
            viewModel.ProductsSelectList = products.Select(p => new SelectListItem 
                {
                    Value = p.Id.ToString(),
                    Text = p.Name
                });
            viewModel.Products = products;
            
            // Retorna a ViewModel para View/Order/Create
            return View("Create",viewModel);
        }


        // POST: Orders/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,TimeStamp,TotalPrice")] Order order)
        {
            if (ModelState.IsValid)
            {
                _context.Add(order);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(order);
        }

        // GET: Orders/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var order = await _context.Order.FindAsync(id);

            return View(order);
        }

        // POST: Orders/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,TimeStamp,TotalPrice")] Order order)
        {
            if (id != order.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(order);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!OrderExists(order.Id))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            return View(order);
        }

        // GET: Orders/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var order = await _context.Order
                .FirstOrDefaultAsync(m => m.Id == id);
            if (order == null)
            {
                return NotFound();
            }

            return View(order);
        }

        // POST: Orders/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var order = await _context.Order.FindAsync(id);
            if (order != null)
            {
                _context.Order.Remove(order);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool OrderExists(int id)
        {
            return _context.Order.Any(e => e.Id == id);
        }
    }
}
