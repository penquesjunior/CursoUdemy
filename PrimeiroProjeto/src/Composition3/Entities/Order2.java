package Composition3.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client2 client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order2() {
    }

    public Order2(Date moment, OrderStatus status, Client2 client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client2 getClient() {
        return client;
    }

    public void setClient(Client2 client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItems(OrderItem item) {
        items.add(item);
    }

    public void removeItems(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}