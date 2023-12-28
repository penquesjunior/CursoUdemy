package ExVetorMatrix;
import java.util.Locale;
import java.util.Scanner;

import ExVetorMatrix.Etities.Product;

public class ExVetor2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Product[] vect = new Product[n];

        for(int i =0; i < vect.length; i++){
           sc.nextLine(); //para pular linha
            System.out.printf("Cadastre nome do item:");
            String name = sc.nextLine();
            System.out.printf("Cadastre preço do item:");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i=0; i <vect.length; i++){
            sum += vect[i].getPrice();
        }

        sum = sum/n;

        for(int i =0; i<vect.length; i++){
            System.out.println(vect[i].getName() + " = " +vect[i].getPrice());
        }
        System.out.printf("AVERAGE PRICE = %.2f%n" , sum);
        sc.close();
    }
}