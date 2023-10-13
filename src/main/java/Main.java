public class Main {
    public static void main(String[] args){
        HotDrink coffee = new HotDrink("Coffee", 2.50, 10, 80);
        HotDrink tea = new HotDrink("Tea", 1.50, 15, 70);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 3.00, 8, 85);
        System.out.println(coffee.toString());
        System.out.println(tea.toString());
        System.out.println(hotChocolate.toString());
    }
}
