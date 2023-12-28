package ExVetorMatrix;
import java.util.Scanner;

public class ExVetor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite quantidade de numero: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int soma = 0;
        System.out.printf("VALORES :");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf(vect[i] + ",");
            soma += vect[i];
        }
        System.out.printf("\nSOMA :" + soma);
        int media = soma / vect.length;
        System.out.println("\nMEDIA :" + media);

        sc.close();
    }
}
