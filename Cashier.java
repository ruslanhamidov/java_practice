class Cashier {
   
   double getOrderPrice(Order newOrder) {
      return newOrder.orderProduct.getPrice();
   }

   String getOrderName(Order newOrder) {
      return newOrder.orderProduct.getName();
   }

   void processPayment(Order newOrder, CashRegister cashRegister) {
      double money = getOrderPrice(newOrder); 
      cashRegister.addToCash(money);
   }
}