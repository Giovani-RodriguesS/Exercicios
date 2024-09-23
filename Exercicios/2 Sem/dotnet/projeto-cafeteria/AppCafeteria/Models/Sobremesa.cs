using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AppCafeteria.Models
{
    public class Sobremesa : Item
    {
        public string Sabor { get; private set; }

        public Sobremesa(string nome, decimal preco, string sabor) : base(nome, preco) { Sabor = nome; }

    }
}