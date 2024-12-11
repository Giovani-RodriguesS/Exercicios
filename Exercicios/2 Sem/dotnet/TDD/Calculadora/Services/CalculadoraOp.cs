using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace desafio_tdd.Services
{
    public class CalculadoraOp
    {
        private List<string> Historico; // declaracao de Historico
        public CalculadoraOp () // construtor
        {
            Historico = new List<string>();
        }
        public int Somar (int num1, int num2) // func somar 
        {
            return (num1+num2);
        }
        public int Subtracao (int num1, int num2) // func subtrair
        {
            return (num1-num2);
        }
        public int Multiplicao (int num1, int num2) // func multiplicação
        {
            return (num1*num2);
        }
        public double Divisao (int num1, int num2) // func Divisao
        {
            return (num1/num2);
        }
        public List<string> historicoResultados () // retorna a lista
        {   
            return Historico;
        }
    }
}