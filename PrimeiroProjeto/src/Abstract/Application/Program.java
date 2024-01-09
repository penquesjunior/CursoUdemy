package Abstract.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Abstract.Entities.Circulo;
import Abstract.Entities.Color;
import Abstract.Entities.Retangulo;
import Abstract.Entities.Shape;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("entre the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre #" + i + " data: ");
            System.out.print("Retangle or circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("width ");
                double width = sc.nextDouble();
                System.out.print("height ");
                double height = sc.nextDouble();
                list.add(new Retangulo(color, width, height));
            } else {
                System.out.print("Radius ");
                double radius = sc.nextDouble();
                list.add(new Circulo(color, radius));
            }

        }

        System.out.println();
        System.out.println("Shape Areas: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
