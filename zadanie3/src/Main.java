import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsze słowo: ");
        String napis1= scanner.nextLine();
        System.out.print("Podaj 2 słowo ");
        String napis2= scanner.nextLine();
        String result=napis2+" "+napis1;
         System.out.print(result);



       // String result=napis2+" "+napis1;
       // System.out.print(result);
    }
}