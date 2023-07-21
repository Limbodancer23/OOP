package lsp2.model;

public class OrderBonus extends Orderable{

    public OrderBonus(int quantity, int price) {
        super(price, quantity);
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
