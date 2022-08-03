import java.util.*; 
import java.util.Scanner; 
import java.util.Date; 
class Account
{
   int id;
   Scanner s=new Scanner(System.in); 
   double balance,annualInterestRate; 
   String date;
   Account()
   { 
     //int id=0;
     //int balance=500;
     //int annualInterestRate=7; 
     date="12/02/2001";
    }
    Account(int i1,double balan) 
    {
       id=i1;
       balance=balan; 
    }
    int getId() 
    {
      return id; 
    }
    double getBalance()
    { 
        return balance; 
    }
    double getAnnualInterestRate()
    { 
        return annualInterestRate; 
    }
    String getDate()
    { 
        return date; 
    }
}
class Acc
{ 
        public static double getMonthlyInterest(Account obj)
        { 
            return (obj.getBalance() * obj.getAnnualInterestRate() * 0.01 / 12);
        } 
        public static double getMonthlyInterestRate(Account obj)
        { 
            return ((obj.getAnnualInterestRate()/1200) * (getMonthlyInterest(obj)));
        }
        public static void withdraw(Account obj) 
        { 
            double with;
            Scanner s1=new Scanner(System.in); 
            System.out.println("enter the money you want to withdraw:"); 
            with=s1.nextDouble();
            obj.balance=obj.balance-with;
            System.out.println("your current balance is: " + obj.balance); 
        }
        public static void deposite(Account obj) 
        { 
            double dep;
            Scanner s2=new Scanner(System.in); 
            System.out.println("enter the money you want to deposite:"); 
            dep=s2.nextDouble();
            obj.balance=obj.balance+dep;
            System.out.println("your current balance is: " + obj.balance);
        }
        public static void main(String args[]) 
        { 
            Account a=new Account();
            double mi,mir; System.out.println("Name:Mann Patel"); 
            System.out.println("ID:18dcs074");
            mi=getMonthlyInterest(a);
            mir=getMonthlyInterestRate(a);
            withdraw(a);
            deposite(a);
            System.out.println("your monthly interest is:"+ mi + " \n"+"your monthly interest rate is:"+ mir ); 
        }
}