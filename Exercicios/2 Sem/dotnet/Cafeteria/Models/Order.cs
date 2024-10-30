using System.ComponentModel.DataAnnotations;

namespace Cafeteria.Models;

public class Order
{
    public int Id { get; set; }
    public required string Name { get; set; }
    public int Quantity { get; set; }
    public required string Client { get; set; }
}