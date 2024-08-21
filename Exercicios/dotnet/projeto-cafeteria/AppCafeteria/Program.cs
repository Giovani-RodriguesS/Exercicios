using System;
using AppCafeteria.Models;

public class Program
{
    public static void Main(string[] args)
    {   
        Item item = new Item("Pão", 12.0m);
        Bebida cafe = new Cafe("Capuccino", 2.50m, "Grande", "Expresso");
        Sobremesa pudin = new Sobremesa("Pudim", 7.50m, "Doce");
        Pedido pedido = new Pedido(1, "Giovani");
        pedido.AdicionarItem(cafe);
        pedido.AdicionarItem(pudin);
        pedido.AdicionarItem(item);
        pedido.CalcularTotal();
        Console.WriteLine(pedido.Total);
        
    }
}