package Polimorfismo2.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo2.Entities.ImportedProduct;
import Polimorfismo2.Entities.Product;
import Polimorfismo2.Entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Entre com a quantidade de produtos: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Produto n°" + i + " data:");
            System.out.print("Comum, usado ou importado (c/u/i): ");
            sc.nextLine();
            char ch = sc.nextLine().charAt(0);
            if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Infome a data de Fabricacao (dd/mm/yyyy): ");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Qual valor do imposto: ");
                Double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }

        }
        System.out.println();
        System.out.println("Etiquetas de preco:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();

    }
}
