import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj planetę na której chemy obliczyć wiek: ");
        String planet = scanner.next().toLowerCase();
        scanner.useLocale(Locale.US);

        System.out.println("Podaj wiek w sekundach");
        double age = scanner.nextDouble();
        switch (planet) {
            case "merkury":
                double help_with_age = age / 7604323;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "wenus":
                help_with_age = age / 19473161;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "mars":
                help_with_age = age / 59305120;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "jowisz":
                help_with_age = age / 374335989;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "saturn":
                help_with_age = age / 931659792.192;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "neptun":
                help_with_age = age / 5207832849.92;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;
            case "uran":
                help_with_age = age / 2655743157.0;
                System.out.printf("Wiek na " + planet + " = "+"%.2f",help_with_age);
                break;


        }


    }
}