import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int num=0;
        System.out.println("Notas:");
        num=(int) valor/100;
        System.out.printf("%d de R$100,00%n", num);
        valor = valor%100;

        num=(int) valor/50;
        System.out.printf("%d de R$50,00%n", num);
        valor = valor%50;

        num=(int) valor/20;
        System.out.printf("%d de R$20,00%n", num);
        valor = valor%20;

        num=(int) valor/10;
        System.out.printf("%d de R$10,00%n", num);
        valor = valor%10;

        num=(int) valor/5;
        System.out.printf("%d de R$50,00%n" , num);
        valor = valor%5;

        num=(int) valor/2;
        System.out.printf("%d de R$2,00%n", num);
        valor = valor%2;

        valor= valor * 100;

        System.out.println("Moedas: ");

        num=(int) valor/100;
        System.out.printf("%d de R$1,00%n", num);
        valor = valor%100.0;

        num=(int) valor/50;
        System.out.printf("%d de R$0,50%n", num);
        valor = valor%50.0;

        num=(int) valor/25;
        System.out.printf("%d de R$0,25%n", num);
        valor = valor%25.0;

        num=(int) valor/10;
        System.out.printf("%d de R$0,10%n", num);
        valor = valor%10.0;

        num=(int) valor/5;
        System.out.printf("%d de R$0,05%n", num);
        valor = valor%5.0;

        num=(int) valor/1;
        System.out.printf("%d de R$0,01%n", num);
        valor = valor%1.0;


        sc.close();
    }
}
