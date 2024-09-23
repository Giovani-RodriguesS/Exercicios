using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;

namespace AppCafeteria.Models
{
    public class Pedido
    {
        // Atributos
        public int NumeroPedido { get; private set; }
        public string Cliente { get; private set; }
        public List<Item> Itens { get; private set; }
        public decimal Total { get; private set; }

        public Pedido (int numeroPedido, string cliente)
        {
            NumeroPedido = numeroPedido;
            Cliente = cliente;
            Itens = new List<Item> ();
            Total = 0;
        }

        public void AdicionarItem(Item item)
        {
            Itens.Add(item);
        }
        public void RemoverItem(Item item)
        {
            Itens.Remove(item);
        }
        public void CalcularTotal()
        {
            if (Itens.Count() > 0)
                foreach (Item item in Itens)
                {
                    Total = item.Preco + Total;
                }
            else
                Console.WriteLine("Sem itens...");
        }
    }
}