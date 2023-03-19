import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Student {
        String Name, Second_name;
        int index = 0, presence = 0;
        int[] grades= new int[10];
    }

    public static void FirstStudent()

    {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Podaj imie studenta: ");
        student1.Name = scanner.nextLine();
        System.out.println("Podaj jego nazwisko: ");
        student1.Second_name = scanner.nextLine();
        System.out.println("Podaj jego index: ");
        student1.index = scanner.nextInt();
        if (student1.Name == "" || student1.Second_name == "") {
            student1.Name = "Unknown";
            student1.Second_name = "Unknown";
        }
        System.out.println("POdaj jego obecnosc(%): ");
        student1.presence = scanner.nextInt();

        if (student1.presence < 50) {
            student1.grades[0] = 2;
       }

        System.out.println("Podaj ile chcesz dodac ocen: ");
        int help = scanner.nextInt();

        for (int i = 1; i <= help; i++) {
            if (student1.grades[0] == 2) {
                System.out.println("Dodaj " + i + " ocene:");
                student1.grades[i ] = scanner.nextInt();
            } else {
                System.out.println("Dodaj " + i + " ocene:");
                student1.grades[i] = scanner.nextInt();
            }
        }
        System.out.println("Student 1 ma na imie: " + student1.Name + " " + student1.Second_name +
                ", jego index to: " + student1.index + ", obecnosc: " + student1.presence +
                "%, i oceny: " + Arrays.toString(student1.grades));

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ile chcesz dodac studentow");
        int help = scanner.nextInt();
        for (int i = 1; i <= help ; i++) {
            FirstStudent();
        }

    }


}
