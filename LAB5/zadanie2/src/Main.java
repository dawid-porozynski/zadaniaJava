import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        System.out.println("Podaj liczby dla zbioru A (pojedyncze liczby oddzielone spacją):");
        Scanner scanner = new Scanner(System.in);
        String inputA = scanner.nextLine();

        System.out.println("Podaj liczby dla zbioru B (pojedyncze liczby oddzielone spacją):");
        String inputB = scanner.nextLine();

        try {
            setA = parseInputToSet(inputA);
            setB = parseInputToSet(inputB);

            Set<Integer> result = calculateSetIntersection(setA, setB);

            System.out.println("Wynik:");
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowy format liczby. Podaj liczby całkowite oddzielone spacją.");
        }
    }

    private static Set<Integer> parseInputToSet(String input) {
        String[] numberStrings = input.split(" ");
        Set<Integer> set = new HashSet<>();

        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            set.add(number);
        }

        return set;
    }

    private static Set<Integer> calculateSetIntersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        result.retainAll(setB);

        return result;
    }
}