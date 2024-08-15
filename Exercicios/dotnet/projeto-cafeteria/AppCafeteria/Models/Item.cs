using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AppCafeteria.Models
{
    public class Item
    {
        // Atributos
        public string Nome { get; private set; }

        public decimal Preco { get; protected set; }
        // Construtor
        public Item(string nome, decimal preco)
        {
            Nome = nome;
            Preco = preco;
        }

        // Métodos
        public virtual decimal CalcularPreco() { return Preco; }

    }
}