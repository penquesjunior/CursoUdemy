package ExVetorMatrix;
import java.util.Scanner;

public class ExVetor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println("Insira as alturas");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        sum = sum / n;

        System.out.printf("AVERAGE HIGHT: %.2f%n", sum);

        sc.close();
    }
}
