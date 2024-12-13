using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CafeteriaAPI.Models
{
    public class ProductDTO
    {
        public required string Name { get; set; }
        public int Quantity { get; set; }
        public required string Category { get; set; }
        public decimal Price { get; set; }
    }
}