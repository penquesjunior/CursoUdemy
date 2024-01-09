package Polimorfismo2.Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {

    private LocalDate manufactoreDate;



    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, LocalDate manufactoreDate) {
        super(name, price);
        this.manufactoreDate = manufactoreDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (usado) $ " 
        + String.format("%.2f", getPrice())  + " (data de fabricação: " 
        + manufactoreDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) +")";
    }

}
