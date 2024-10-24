public class Account : IComparable<Account>
{
    public string User { get; private set; }
    public int Number { get; private set; }

    public Account(string user, int number)
    {
        User = user;
        Number = number;
    }

    public int CompareTo(Account other)
    {
        if (this.Number < other.Number)
            return -1;
        if (Number > other.Number)
            return 1;
        return 0;
    }

    public override string ToString()
    {
        return string.Format("", User, Number);
    }
} 