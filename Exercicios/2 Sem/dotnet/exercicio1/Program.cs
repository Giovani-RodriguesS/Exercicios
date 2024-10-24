
Product [] product = new Product [5];

product [0] = new Product ("Café", 12.5);
product [1] = new Product ("Chá", 10);
product [2] = new Product ("Pêra", 1.5);
product [3] = new Product ("Bolo", 2.5);
product [4] = new Product ("Lasanha", 15);

Product greatest = product [0];

for (int i = 0; i<product.Length; i++)
{
    if (product[i].Price > greatest.Price)
        greatest = product[i];

}
Product secGreatest = product[0];

for(int i = 0; i<product.Length;i++)
{
    if(product[i].Price > secGreatest.Price && !product[i].Name.Equals(greatest.Name))
        secGreatest = product[i];
}

Console.WriteLine (greatest);
Console.WriteLine (secGreatest);
