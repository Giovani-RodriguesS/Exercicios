namespace Cafeteria.Models;
public class OrderDetailsViewModel
{
    public Order? Order { get; set; }
    public List<ProductViewOrderDetail>? ItemsOfOrder { get; set; }
}