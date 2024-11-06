using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using CafeteriaAPI.Models;

namespace CafeteriaAPI.Data
{
    public class CafeteriaContext : DbContext
    {
        public CafeteriaContext (DbContextOptions<CafeteriaContext> options)
            : base(options)
        {
        }

        public DbSet<CafeteriaAPI.Models.Product> Product { get; set; } = default!;

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
        // Ignorar a classe ProductDTO
        modelBuilder.Ignore<ProductDTO>();

        base.OnModelCreating(modelBuilder);
        }
    }
}
