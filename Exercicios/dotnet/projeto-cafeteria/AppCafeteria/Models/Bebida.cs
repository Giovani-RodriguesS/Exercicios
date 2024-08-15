using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AppCafeteria.Models
{
    public abstract class Bebida : Item
    {
        public string Tamanho { get; private set; }

        public Bebida(string nome, decimal preco, string tamanho) : base(nome, preco)
        { 
            Tamanho = tamanho;
        }
        public override abstract decimal CalcularPreco(); 
    }
}