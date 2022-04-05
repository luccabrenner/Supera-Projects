import javax.swing.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []numeros= new int[4];
        int conta= 0;
        int aux;
        System.out.println("Digite um numero: ");
        for (int i=0;i<numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        for (int i=0;i< numeros.length; i++){
            if (numeros[i]%2==0){
                conta ++;
             }
            }
            int[] par= new int[conta];
            int[] impar = new int[numeros.length - par.length];

        // visualizar numeros do Array
        /*
        for (int n: numeros){
            System.out.println("Seus numeros sao: " + n);
        }

         */
        System.out.println("Numeros pares: ");
        for (int i = 0, j =0 ; i< numeros.length;i++){
            if (numeros[i] %2 ==0){
                par[j]= numeros[i];
                System.out.println( par [j] + " ");
                j++;
            }
        }
        System.out.println("Numeros impares: ");
        for (int i = 0, j =0 ; i< numeros.length;i++){
            if (numeros[i] %2 !=0){
                impar[j] = numeros[i];
                System.out.println( impar[j] + " ");
                j++;
            }
        }

    }
}



