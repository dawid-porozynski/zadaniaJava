import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static class Invoice {
        String product_number,product_description;
        int quantity=0;
        double price_per_item=0;
        public static void Write() {
            Scanner scanner = new Scanner(System.in);
            Invoice write = new Invoice();
            System.out.println("wpsiz ilosc produktu: ");
            write.product_number=scanner.toString();

            System.out.println("Wpsiz nazwe produktu: ");
            write.product_description=scanner.toString();

            System.out.println("Wpisz ilosc: ");
            write.quantity = scanner.nextInt();

            System.out.println("wpisz cene za produkt: ");
            write.price_per_item = scanner.nextDouble();

        }

    }
    public static void Amount(){
        Invoice.Write();

    }

    public static void main(String[] args) {
        Amount();

    }
}