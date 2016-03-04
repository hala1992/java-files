/**

 * This class simulates a bank account.
 */

public class BankAccount
{
   private double balance;      // Account balance
   private double interestRate; // Interest rate
   private double interest;     // Interest earned

   public BankAccount(double startBalance,
                      double intRate)
   {
      balance = startBalance;
      interestRate = intRate;
      interest = 0.0;
   }


   public void deposit(double amount)
   {
      balance = balance + amount;
   }


   public void withdraw(double amount)
   {
      balance = balance - amount;
   }

   public void addInterest()
   {
      interest = balance * interestRate;
      balance = balance + interest;
   }


   public double getBalance()
   {
      return balance;
   }


   public double getInterest()
   {
      return interest;
   }
}
