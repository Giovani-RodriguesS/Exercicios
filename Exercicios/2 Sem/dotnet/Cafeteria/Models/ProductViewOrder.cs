using Microsoft.AspNetCore.Mvc.Rendering;
using System.Collections.Generic;

namespace Cafeteria.Models;

public class ProductViewOrder
{
    public string? Name { get; set; }
    public string? Category { get; set; }
    public string? Quantity { get; set; }
    public decimal? Price { get; set; }
    public decimal? SubTotal { get; set; }
}

