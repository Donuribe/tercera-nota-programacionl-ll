
public class main {
   public static class bankaccount {
      //atributos 
      String accountnumber;
      String owner;
      double balance;
      //métodos
      void deposit (double amount) {
         balance += amount;
         System.out.println("deposito:"+ amount +" | nuevo balance: "+ balance);
      }
      void withdraw (double amount){
         if (balance >= amount) {
            balance -= amount;
            System.out.println("retiro:"+ amount +" | nuevo balance: "+ balance);
         } else {
            System.out.println("Fondos insuficientes para retirar: " + amount);
         }
      }
      void showBalance() {
         System.out.println("El balance actual es: " + balance);
      }

   }

   public static void main(String[] args) throws Exception {
      bankaccount account1 = new bankaccount();
      account1.accountnumber = "5555-5555-5555";
      account1.balance = 5000000;
      account1.owner = "uribe";
      System.out.println(account1.balance);

      account1.deposit(1000000);
      System.out.println(account1.balance);
      System.out.println(account1.owner);
   }
}
