package Polimorfismo.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Entities.Employee;
import Polimorfismo.Entities.OutSourcedEmplye;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the Number of Employess: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employe #" + i + " data:");
            System.out.print("Outsourced (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            sc.nextLine();// tem que pula uma linha pois o next line vai ler apenas a proxima linha
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            Double valuePerHour = sc.nextDouble();
            if (ch == 'y' || ch == 'Y') {
                System.out.print("Aditional Charge: ");
                double aditionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmplye(name, hours, valuePerHour, aditionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }
        System.out.println("PAYMENTS: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }

}
