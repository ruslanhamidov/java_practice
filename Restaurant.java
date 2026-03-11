class Restaurant {
   public static void main(String[] args) {
      Product latte = new Product("Latte", 5.6);
      Product tea = new Product("Tea", 1.5);
      Product americano = new Product("Americano", 3.0);
      Menu myMenu = new Menu();
      myMenu.addToMenu(latte);
      myMenu.addToMenu(tea);
      myMenu.addToMenu(americano);
      myMenu.listMenu();
      Order newOrder = new Order(latte);
      Cashier cashierLenny = new Cashier();
      CashRegister cashRegister = new CashRegister();
      
      System.out.println("Price of " + latte.getName() + " is " + latte.getPrice());
      System.out.println("Cash in register is " + cashRegister.getCash());
      cashierLenny.processPayment(newOrder, cashRegister);
      System.out.println("Cash in register is " + cashRegister.getCash());
   }
}