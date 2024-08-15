using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AppCafeteria.Models
{
    public class Cafe(string nome, decimal preco, string tamanho, string tipo) : Bebida(nome, preco, tamanho)
    {
        public string Tipo { get; private set; } = tipo;
    
        public override decimal CalcularPreco()
        {   
            return Tamanho == "Grande" ? Preco*2 : Preco;
        }

        public override string ToString() 
        {
            return $"Nome: {Nome}, Preco: {Preco}, Tamanho: {Tamanho}, Tipo: {Tipo}";
        }
    }
}