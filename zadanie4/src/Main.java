import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Wpisz 1 liczbe: ");
        int a= scanner.nextInt();
        System.out.print("Wpisz 2 liczbe: ");
        int b= scanner.nextInt();
        System.out.print("Wpisz 3 liczbe: ");
        int c= scanner.nextInt();
        if( a+b>c){
            if (a+c>b){
                if (b+c>a){
                    System.out.println("TAK");
                    }
                }
            }
        else {
            System.out.println("NIE");
        }
        }
            
        }


