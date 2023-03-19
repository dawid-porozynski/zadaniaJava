import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie do sprawdzenia czy jest panagramem: ");
        String pangram = scanner.nextLine();
        boolean is_Pangram = If_Pangram(pangram);
        System.out.println(is_Pangram);
    }

    public static boolean If_Pangram(String pangram) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean[] isPresent = new boolean[26];
        for (int i = 0; i < 26; i++) {
            isPresent[i] = false;
        }

        for (int i = 0; i < pangram.length(); i++) {
            char help = pangram.charAt(i);
            if (Character.isLetter(help)) {
                int index = Character.toLowerCase(help) - 'a';
                isPresent[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                return false;
            }
        }
        return true;
    }
}