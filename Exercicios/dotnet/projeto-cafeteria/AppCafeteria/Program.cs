using System;
using AppCafeteria.Models;

public class Program
{
    public static void Main(string[] args)
    {   
        Item item = new Item("Pão", 12.0m);
        Bebida cafe = new Cafe("Capuccino", 2.50m, "Grande", "Expresso");
        Sobremesa pudin = new Sobremesa("Pudim", 7.50m, "Doce");
        Console.WriteLine($"{cafe.CalcularPreco()}");
        
    }
}