package ExVetorMatrix;
import java.util.Scanner;

import ExVetorMatrix.Etities.Altura;

public class ExVetor5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Altura[] vect = new Altura[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite a pessoa n°" + (i+1)+ ":");
            sc.nextLine();
            System.out.printf("Nome: ");
            String name = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Altura(name, idade, altura);
        }

        double somaAltura = 0;
        int salvaIdadeMenor = 0;
        String salvaNome = "";
        for (int i = 0; i < vect.length; i++) {
            somaAltura += vect[i].getAltura();
            if (vect[i].getIdade() < 16) {
                salvaIdadeMenor += 1;
                salvaNome += vect[i].getName() + " ";
            }
        }
        // PORCENTAGEM NAO ESTA FUNCIONANDO --'
        double porcentagem = (salvaIdadeMenor *100.0) /vect.length;
        somaAltura = somaAltura / vect.length;

        System.out.printf("Altura Média: %s", somaAltura);
        System.out.printf("\nPessoas com menos de 16 anos: %s " , porcentagem);
        System.out.printf("\nNome das pessoas com menos de 16 anos : %s", salvaNome);

        sc.close();
    }
}