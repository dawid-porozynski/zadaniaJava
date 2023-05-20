import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = readNumbersFromInput();

        sortNumbers(numbers);

        printSortedNumbers(numbers);
    }

    private static List<Integer> readNumbersFromInput() {
        System.out.println("Podaj liczby (pojedyncze liczby oddzielone spacją):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numberStrings = input.split(" ");
        List<Integer> numbers = new ArrayList<>(numberStrings.length);
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format liczby: " + numberString);
            }
        }

        return numbers;
    }

    private static void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static void printSortedNumbers(List<Integer> numbers) {
        System.out.print("Posortowane liczby: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers.get(i));
        }
        System.out.println();
    }
}