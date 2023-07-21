package lsp2.model;

public abstract class Orderable {
    protected final  int price;
    protected final  int quantity;

    public Orderable(int quantity, int price){
        this.price = price;
        this.quantity = quantity;
    }
    public abstract double getAmount();

    @Override
    public String toString() {
        return "Orderable{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}' + "It`s a bonus";
    }
}
