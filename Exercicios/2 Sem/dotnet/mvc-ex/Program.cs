Account c1 = new Account("Giovani", 1232123);
Account c2 = new Account("Perosa", 90097733);
Account c3 = new Account("Brizola", 200003221);

List<Account> accounts = new List<Account>();
Dictionary dictionary = new Dictionary<string, Account>();

dictionary.Add("1", c1);
dictionary.Add("2", c2);
dictionary.Add("3", c3);

accounts.Add(c1);
accounts.Add(c2);
accounts.Add(c3);

accounts.Sort(new AccountComparer());

Console.ReadLine;
console.WriteLine("");