class Restaurant {
   public static void main(String[] args) {
      Product latte = new Product("Latte", 5.6);
      Order newOrder = new Order(latte, 6);
      Cashier cashierLenny = new Cashier();
      CashRegister cashRegister = new CashRegister();
      
      
      System.out.println("Price of " + latte.getName() + " is " + latte.getPrice());
      System.out.println("Cash in register is " + cashRegister.getCash());
      cashierLenny.processPayment(newOrder, cashRegister);
      System.out.println("Cash in register is " + cashRegister.getCash());
   }
}