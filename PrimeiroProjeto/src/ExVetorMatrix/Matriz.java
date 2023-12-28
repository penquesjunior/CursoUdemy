package ExVetorMatrix;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        // pode usar tanto n quanto matriz.lengh que e a mesma quantidade

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Sequencia da diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(matriz[i][i] + " ");

        }

        int numNegative = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    numNegative++;
                }
            }
        }
        System.out.println("\nNEGATIVE NUMBERS: " + numNegative);

        sc.close();
    }
}
