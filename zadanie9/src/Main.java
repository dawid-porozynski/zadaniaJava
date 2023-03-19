import java.util.Arrays;
import java.util.Scanner;



public class Main {
    static void is_palindrom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo aby sprawdzić czy jest palindromem:");
        String palindrom = scanner.nextLine().toLowerCase();
        int i=0;
        int j=palindrom.length()-1;
        while ( i <  j){
            if (palindrom.charAt(i) != palindrom.charAt(j)){
                System.out.println("nie");
                System.exit(0);
            }
            i++;
            j--;

        }
        System.out.println("tak");

    }
    public static void main(String[] args) {

        is_palindrom();
    }
}