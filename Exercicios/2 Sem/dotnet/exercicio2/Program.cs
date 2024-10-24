int option = 0;
StockManager stockManager = new StockManager();

do
{
    Console.WriteLine("---------------------------------");
    Console.WriteLine("Escolha uma opção:");
    Console.WriteLine("1 - Cadastrar novo produto.");
    Console.WriteLine("2 - Remover produto.");
    Console.WriteLine("3 - Pesquisar um produto.");
    Console.WriteLine("4 - Listar produtos.");
    Console.WriteLine("0 - Sair.");

    option = Convert.ToInt32(Console.ReadLine());

    switch(option)
    {
        case 0: Console.WriteLine("Saindo do programa.");
                break;

        case 1: Console.WriteLine("---------------------------------");
                Console.WriteLine("Informe o nome do produto:");
								#pragma warning disable CS8600 // Converting null literal or possible null value to non-nullable type.
		            string name = Console.ReadLine();
								#pragma warning restore CS8600 // Converting null literal or possible null value to non-nullable type.
		            Console.WriteLine("Informe o preço do produto:");
                double price = Convert.ToDouble(Console.ReadLine());
                if(name==null)
                    Console.WriteLine("Falha ao cadastrar o produto.");
                else
                {
                    stockManager.AddProduct(name,price);
                    Console.WriteLine("Produto cadastrado com sucesso!");
                }
                break;
        
        case 2: Console.WriteLine("---------------------------------");
                Console.WriteLine("Informe o nome do produto:");
								#pragma warning disable CS8600 // Converting null literal or possible null value to non-nullable type.
                name = Console.ReadLine();
								#pragma warning restore CS8600 // Converting null literal or possible null value to non-nullable type.
                if(name==null)
                    Console.WriteLine("Falha ao remover o produto.");
                else
                {
                    if(stockManager.RemoveProduct(name))
                        Console.WriteLine("Produto removido com sucesso!");
                    else
                        Console.WriteLine("Falha ao remover o produto.");
                }    
                break;
        
        case 3: Console.WriteLine("---------------------------------");
                Console.WriteLine("Informe o nome do produto:");
								#pragma warning disable CS8600 // Converting null literal or possible null value to non-nullable type.
                name = Console.ReadLine();
								#pragma warning restore CS8600 // Converting null literal or possible null value to non-nullable type.
								#pragma warning disable CS8604 // Possible null reference argument.
		            Console.WriteLine(stockManager.SearchProduct(name));
								#pragma warning restore CS8604 // Possible null reference argument.
		            break;
        
        case 4: Console.WriteLine("---------------------------------");
                stockManager.ListAllProducts();
                break;
        
        default:    Console.WriteLine("Opção Inválida!");
                    break;
    }
}while(option!=0);