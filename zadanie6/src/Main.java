import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wpisz 3 liczby");
        Scanner scanner = new Scanner(System.in);
        float a= scanner.nextFloat();float b= scanner.nextFloat();float c= scanner.nextFloat();
        Float[] numbers = {a, b, c};
        if (numbers[0]==numbers[1] || numbers[0]==numbers[2] || numbers[1]==numbers[2]){
            System.out.println("Liczby nie mogą być takie same");
        }
        if (numbers[0] < numbers[1] && numbers[1]<numbers[2]){
            System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]);
            System.out.println(numbers[2]+" "+numbers[1]+" "+numbers[0]);
        } else if (numbers[0] < numbers[1] && numbers[1] > numbers[2]) {
            System.out.println(numbers[0]+" "+numbers[2]+" "+numbers[1]);
            System.out.println(numbers[1]+" "+numbers[2]+" "+numbers[0]);
        } else if (numbers[0]>numbers[1]&&numbers[0]<numbers[2]) {
            System.out.println(numbers[1]+" "+numbers[0]+" "+numbers[2]);
            System.out.println(numbers[2]+" "+numbers[0]+" "+numbers[1]);
        }
        else if (numbers[0]>numbers[1]&&numbers[0]>numbers[2]) {
            System.out.println(numbers[1]+" "+numbers[2]+" "+numbers[0]);
            System.out.println(numbers[0]+" "+numbers[2]+" "+numbers[1]);
        }
    }
}
