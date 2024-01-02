package Enumeração.Application;

import java.util.Date;

import Enumeração.Entities.Order;
import Enumeração.Entities.OrderStatus;

public class Program {

    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);
    }
    
}
