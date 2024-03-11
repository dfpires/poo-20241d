//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Sabonete", 6.8f, 1);
        Product product2 = new Product("bexiga", 3.0f, 2);

        ShoppingCart shoppingCart1 = new ShoppingCart(1001, 0);
        shoppingCart1.setCarItem(10, 100, product1);
        ShoppingCart shoppingCart2 = new ShoppingCart(1002, 0);
        shoppingCart2.setCarItem(11, 50, product1);
        ShoppingCart shoppingCart3 = new ShoppingCart(1003, 0);
        shoppingCart3.setCarItem(12, 60, product2);
        System.out.println(shoppingCart1.toString());
        System.out.println(shoppingCart2);
        System.out.println(shoppingCart3);
    }
}