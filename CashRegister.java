class CashRegister {
   private double cash;

   public CashRegister() {
      this.cash = 0;
   }

   double getCash() {
      return this.cash;
   }

   void addToCash(double money) {
      this.cash += money;
   }
}