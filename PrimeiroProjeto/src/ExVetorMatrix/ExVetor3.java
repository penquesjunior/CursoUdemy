package ExVetorMatrix;
import java.util.Scanner;

/**
 * ExVetor3
 */
public class ExVetor3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um quantidade de numero menor que 10 \n");
        int n = sc.nextInt(); 

        if(n>=0 && n<=10){
       

        int[] vect = new int[n];

        for(int i=0; i< vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i=0; i<vect.length; i++){
            int[] aux = new int[vect.length];
            if(vect[i] < 0){
                aux[i] = vect[i]; 
                 System.out.println(aux[i]);
            }
        }
    }

    sc.close();
}

}