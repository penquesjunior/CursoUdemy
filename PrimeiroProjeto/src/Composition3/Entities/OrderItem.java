package Composition3.Entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;


    // coloca os 2 construtores para ter a flexibilidade de instanciar com argumentos ou sem argumentos.
    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", price) + ", Quantity: " +
                quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }

}
