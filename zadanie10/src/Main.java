import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz rozmiar tablicy:");
        int i = 0, j = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array_2D = new int[a][b];

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {

                array_2D[i][j] = scanner.nextInt();

            }
        }
        for (j = 0; j < b; j++) {
            for (i = 0; i < a; i++) {
                System.out.print(array_2D[i][j]+" ");
                if (i==a-1){
                    System.out.println();
                }
            }
        }
    }
}
