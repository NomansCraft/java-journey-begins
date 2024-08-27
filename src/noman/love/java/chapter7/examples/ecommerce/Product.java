package noman.love.java.chapter7.examples.ecommerce;

public class Product {
    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHARGE = 1.5;

    private final String name;
    private final int weight;
    private final Dimension dimension;
    private int price;
    private int discount;

    public  Product(String name, int price, int discount, int weight, Dimension dimension) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.weight = weight;
        this.dimension = dimension;
    }

    public int getPrice(){
        double price = this.price * ((100 - discount) / 100.0);
        price += weight * SHIPPING_RATE;

        if (dimension.getVolume() > 10) {
            price += dimension.getVolume() * DIMENSION_CHARGE;
        }

        return (int) price;
    }

    public int getDiscount() {
        return this.discount;
    }

    public int getWeight() {
        return this.weight;
    }



    @Override
    public String toString() {
        return "Product {" + "name='" + name + "'" + ", price=" + price + "}";
    }
}
