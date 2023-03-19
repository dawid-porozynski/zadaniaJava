import java.util.Scanner;

public class Main {
    static class Clock{
        int hours=0,minutes=0,seconds=0;

//        public Clock(int a, int b, int c){
//            hours = 12;
//            minutes= 00;
//            seconds= 00;
//        }
    }
    public static void tescik(){

        //konstruktor pierwszy
        Clock first_constructor= new Clock();
        first_constructor.hours=12; first_constructor.seconds=0; first_constructor.minutes=0;
        System.out.println(first_constructor.hours+":0"+first_constructor.minutes+":0"+first_constructor.seconds);

        //konstruktor drugi
        Clock second_constructor = new Clock();
        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz godzine");

        second_constructor.hours = scanner.nextInt();
        if (second_constructor.hours>23){
            System.out.println("Nie ma takiej godziny!");
            System.exit(0);
        }

        System.out.println("wpisz minute ");
        second_constructor.minutes = scanner.nextInt();
        if (second_constructor.minutes>59){
            System.out.println("Nie ma takiej minuty");
            System.exit(0);
        }

        System.out.println("wpisz sekunde");
        second_constructor.seconds = scanner.nextInt();
        if (second_constructor.seconds>59) {
            System.out.println("Nie ma takich sekund");
            System.exit(0);

        }
        System.out.println(second_constructor.hours+" "+ second_constructor.minutes+" "+second_constructor.seconds);

        Clock third_constructor= new Clock();
        third_constructor.seconds = scanner.nextInt();



    }
    public static void main(String[] args) {
        tescik();
    }
}