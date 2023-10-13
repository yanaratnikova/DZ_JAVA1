 public class HotDrink extends Product {
    private int temperature;

     public HotDrink(String name, double price, int count, int temperature) {
         super(name, price, count);
         this.temperature = temperature;
     }

     @Override
     public String toString() {
         return "HotDrink{"  +
                 " name = " + super.getName() +
                 ", price = " + super.getPrice() +
                 ", count = " + super.getCount() +
                 ", temperature=" + temperature +
                 '}';
     }
 }
