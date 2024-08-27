package noman.love.java.chapter7.examples.ecommerce;

public class DigitalProductDemo {
    public static void main(String[] args) {
        DigitalProduct eBook = new DigitalProduct("Java Programming", 750, 15, 0, new Dimension(0, 0, 0));
        var price = eBook.getPrice();

        System.out.println("price = " + price);

    }
}
