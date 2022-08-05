class Account
{
 private int id = 0;
 double balance = 500, annualInterest = 7, amount;
 String dateCreated;
 Account()
 {
 id = 0;
 balance = 50000;
 annualInterest = 7;
 }
 Account(int i, double bal)
 {
 id = i;
 balance = bal;
 }
 void setdata(int i, double bal, double aInt, String dt)
 {
 id = i;
 balance = bal;
 annualInterest = aInt;
 dateCreated = dt;
 }
 int getId()
 {
 return id;
 }
 double getBal()
 {
 return balance;
 }
 double getAnn()
 {
 return annualInterest;
 }
 double getMonthlyInterestRate()
 {
 return (annualInterest * 100) / 12;
 }
 double getMonthlyInterest()
 {
 return balance * (annualInterest * 100) / 12;
 }
 String getDt()
 {
 return dateCreated;
 }
 void withdraw(double amount)
 {
 balance -= amount;
 if (balance > 0)
 {
 System.out.println("The balance left after withdrawal of Rs " + amount + " is Rs. " + balance);
 }
 else
 {
 System.out.println("Withdrawal of Rs " + amount + " is not possible ");
 }
 }
 void deposit(double amount)
  {
  balance += amount;
  System.out.println("The balance left after deposit of Rs." + amount + " is Rs. " + balance);
  }
 }
class SavingAccount extends Account
{
 SavingAccount(double a)
 {
 amount = a;
 balance -= amount;
 }
 public String toString()
 {
 if (balance >= 3000)
 {
  return "The balance left after withdrawal of Rs " + amount + " is Rs. " + balance;
 }
 else
 {
 return "Minimum balance of Rs. 3000 is required.";
 }
 }
}
class CheckingAccount extends Account
{
 CheckingAccount(double am)
 {
 amount=am;
 balance-=amount;
 }
 public String toString()
 {
 System.out.println("Withdrawal successful");
 return "Now the balance left is Rs. "+balance+" after the withdrawal of Rs. "+amount;
 }
}
class pr4
{
 public static void main(String[] args)
 {
 Account a1=new Account();
 Account a2=new Account(123456,100000);
 a2.setdata(1289031,100000,5.6,"2-8-2022");
 System.out.println("Account Details: ");
 System.out.println("Balance : "+a2.balance);
 System.out.println("Annual Interest : "+a2.getAnn());
 System.out.println("Monthly Interest Rate : "+a2.getMonthlyInterestRate());
 System.out.println("Monthly Interest : "+a2.getMonthlyInterest());
 System.out.println("Account was created on :"+a2.getDt());
 a2.withdraw(12000);
 a2.deposit(15000);
 System.out.print("------------------------\n");
 SavingAccount a=new SavingAccount(900);
 CheckingAccount b=new CheckingAccount(1000);
 System.out.println("For Saving Account : ");
 System.out.println(a);
 System.out.print("------------------------\n");
 System.out.println("For Checking Account : ");
 System.out.println(b);
 }
}
