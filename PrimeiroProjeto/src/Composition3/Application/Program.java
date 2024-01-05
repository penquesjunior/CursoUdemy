package Composition3.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Composition3.Entities.Client2;
import Composition3.Entities.Order2;
import Composition3.Entities.OrderItem;
import Composition3.Entities.OrderStatus;
import Composition3.Entities.Product;


public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        Locale.setDefault(Locale.US);// serve para fazer o separador de decimais
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data!");
        System.out.print("Name: ");
        String name = sc.nextLine(); // le o nome
        System.out.print("Email: ");
        String email = sc.next(); // le o email
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next()); // data de nascimento

        Client2 client2 = new Client2(name, email, birthDate);

        System.out.println("Enter order data: " );
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());


        Order2 order = new Order2(new Date(), status, client2);

        System.out.println("How many items to this order? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter #" + (1 + i) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItems(it);            

        }

        System.out.println("\n" + order);



        sc.close();

    }

}
