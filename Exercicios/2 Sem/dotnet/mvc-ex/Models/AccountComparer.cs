public class AccountComparer : IComparer<Account>
{
    public int Compare (Account x, Account y)
    {
        return x.User.CompareTo(y.User);
        Console.WriteLine();
    }        
}
