package Polimorfismo2.Entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice()) 
        + " (custo de importação: " + customsFee + ")";
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }

}
