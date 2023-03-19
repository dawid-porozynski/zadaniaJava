import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj n i m :");
        int declaration_n = scanner.nextInt();
        int declaration_m = scanner.nextInt();

        int[] arr_A = new int[declaration_n];
        int[] arr_B = new int[declaration_m];

      if (declaration_n <= 0 || declaration_m <= 0) {
            System.out.println("BŁĄD: n i m muszą być liczbami naturalnymi większymi od zera.");
            System.exit(1);
        }

        System.out.println("Podaj elementy pierwszej tablicy: ");
        for (int i = 0; i < declaration_n; i++) {

            arr_A[i] = scanner.nextInt();
        }

        System.out.println("Podaj elementy drugiej tablicy: ");
        for (int i = 0; i < declaration_m; i++) {

            arr_B[i] = scanner.nextInt();
        }
        int scalar_product = 0;
        for (int i = 0; i < declaration_n; i++) {
            scalar_product += arr_A[i] * arr_B[i];
        }
        System.out.println("Iloczyn skalarny tablic A i B wynosi: " + scalar_product);


    }
}
