import java.util.ArrayList;

class Menu {
   private ArrayList<Product> products;   
   
   public Menu() {
      this.products = new ArrayList<>();
   }
   
   boolean checkItem(Product newProduct) {
      if (this.products.contains(newProduct)) {
         return true;
      }
      return false;
   }
   
   void addToMenu(Product newProduct) {
      if (!checkItem(newProduct)) {      
         this.products.add(newProduct);
         System.out.println("Product added successfully");
         return;
      }
      System.out.println("This product is already in menu");
   }
   
   void deletefromMenu(Product newProduct) {
      if (checkItem(newProduct)) { 
         this.products.remove(newProduct);
         System.out.println("Product deleted successfully");
         return;
      }
      System.out.println("There is no such product");
   }
   
   void listMenu() {
      for (int i = 0; i < this.products.size(); i++) {
         System.out.println(this.products.get(i).getName() + " " + this.products.get(i).getPrice() + "$");
      }
   }
}