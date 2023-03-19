import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Podaj 1 bok:");
        double a=scan.nextDouble();

        System.out.print("Podaj 2 bok:");
        double b=scan.nextDouble();
        double result=a*b;
        System.out.print(result);



    }
}