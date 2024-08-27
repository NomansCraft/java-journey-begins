package noman.love.java.chapter7.examples.ecommerce;

public class Demo {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Dimension keyboardDim = new Dimension(2, 15, 10);
        Dimension mouseDim = new Dimension(2, 10, 5);
        Dimension ecoDotDim = new Dimension(1, 5, 5);

        Product keyboard = new Product("Mechanical Gaming Keyboard", 48, 10, 2, keyboardDim);
        Product mouse = new Product("Gaming Mouse", 47, 5, 1, mouseDim);
        Product ecoDot = new Product("Eco Dot (4th Generation", 40, 0, 1, ecoDotDim);

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        System.out.println("ShoppingCard = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("TotalPrice = " + totalPrice);
    }
}

