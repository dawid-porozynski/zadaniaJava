import java.util.*;

class Hamster {
    private int hamsterNumber;
    private String hamsterName;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }

    public String getHamsterName() {
        return hamsterName;
    }

    public void setHamsterName(String name) {
        hamsterName = name;
    }
}

class Printer {
    static void printAll(List<Hamster> hl) {
        for (Hamster hamster : hl) {
            System.out.println(hamster.getHamsterNumber() + " - Imię: " + hamster.getHamsterName());
        }
    }
}
public class HamsterMaze {
    public static void main(String[] args) {
        Map<String, Hamster> hamsterMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int hamsterId;
        String hamsterName;

        while (true) {
            try {
                System.out.print("Podaj ID:");
                hamsterId = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (hamsterId < 0) {
                    throw new IllegalArgumentException("ID nie może być ujemne");
                }

                System.out.print("Podaj imię:");
                hamsterName = scanner.nextLine();

                if (hamsterName.isEmpty()) {
                    throw new IllegalArgumentException("Imię Hamstera nie może być puste");
                }

                Hamster hamster = new Hamster(hamsterId);
                hamster.setHamsterName(hamsterName);
                hamsterMap.put(hamsterName, hamster);


                System.out.print("Chcesz dodać kolejnego Hamstera?(tak/nie)");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("nie")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Złe dane wejściowe, spróbuj ponownie");
                scanner.nextLine(); // Consume invalid input
            }
        }

        Printer.printAll(new ArrayList<>(hamsterMap.values()));
    }
}