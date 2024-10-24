List<Account> accounts = new List<Account>();

Account a1 = new ("Brizola", 123412);
Account a2 = new ("Giovani", 857126);
Account a3 = new ("Rafão", 998777);
Account a4 = new ("David", 001231);

accounts.Add(a1);
accounts.Add(a2);
accounts.Add(a3);
accounts.Add(a4);

accounts.Sort();

foreach (Account account in accounts)
{
    Console.WriteLine(account.ToString());
}