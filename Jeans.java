import lesson.AbstractProduct;

public class Jeans extends AbstractProduct {
    private int size;
    public Jeans(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }
}
