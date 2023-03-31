import java.util.Scanner;

public class Main {
    static class Numbers {
        int First_number = 0, Second_number = 0, Third_number = 0;
    }
    public static void Sum(){
        Scanner scanner = new Scanner(System.in);
        Numbers sum = new Numbers();

        System.out.println("wpisz pierwsza liczbe");
        sum.First_number = scanner.nextInt();

        if (sum.First_number<0){
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }

        System.out.println("wpisz druga liczbe");
        sum.Second_number = scanner.nextInt();

        if (sum.Second_number<0){
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }

        System.out.println("wpisz trzecia liczbe");
        sum.Third_number = scanner.nextInt();

        if (sum.Third_number<0) {
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }
            int Sum= sum.First_number+ sum.Second_number+ sum.Third_number;
            System.out.println("Suma wynosi: "+Sum);

    }

        public static void Average(){
            Scanner scanner = new Scanner(System.in);
            Numbers average = new Numbers();

            System.out.println("wpisz pierwsza liczbe");
            average.First_number = scanner.nextInt();

            if (average.First_number<0){
                System.out.println("Wpisz liczbe wieksza od 0");
                System.exit(0);
            }

            System.out.println("wpisz druga liczbe");
            average.Second_number = scanner.nextInt();

            if (average.Second_number<0){
                System.out.println("Wpisz liczbe wieksza od 0");
                System.exit(0);
            }

            System.out.println("wpisz trzecia liczbe");
            average.Third_number = scanner.nextInt();

            if (average.Third_number<0){
                System.out.println("Wpisz liczbe wieksza od 0");
                System.exit(0);
            }

            int Avg= (average.First_number+ average.Second_number+ average.Third_number)/3;
            System.out.println("Srednia wynosi: "+Avg);

        }
    public static void Min() {
        Scanner scanner = new Scanner(System.in);
        Numbers min = new Numbers();

        System.out.println("wpisz pierwsza liczbe");
        min.First_number = scanner.nextInt();

        System.out.println("wpisz druga liczbe");
        min.Second_number = scanner.nextInt();

        System.out.println("wpisz trzecia liczbe");
        min.Third_number = scanner.nextInt();

        if (min.First_number<min.Second_number&&min.First_number< min.Third_number){
            System.out.println("Najmniejsza liczba jest: "+min.First_number);
        }

        if (min.First_number>min.Second_number&&min.Second_number< min.Third_number){
            System.out.println("Najmniejsza liczba jest: "+min.Second_number);
        }

        if (min.Third_number<min.Second_number&&min.First_number> min.Third_number){
            System.out.println("Najmniejsza liczba jest: "+min.Third_number);
        }

    }
    public static void Max() {
        Scanner scanner = new Scanner(System.in);
        Numbers max = new Numbers();

        System.out.println("wpisz pierwsza liczbe");
        max.First_number = scanner.nextInt();

        System.out.println("wpisz druga liczbe");
        max.Second_number = scanner.nextInt();

        System.out.println("wpisz trzecia liczbe");
        max.Third_number = scanner.nextInt();

        if (max.First_number>max.Second_number&&max.First_number> max.Third_number){
            System.out.println("Najwiekwsza liczba jest: "+max.First_number);
        }

        if (max.First_number<max.Second_number&&max.Second_number> max.Third_number){
            System.out.println("Najwiekasza liczba jest: "+max.Second_number);
        }

        if (max.Third_number>max.Second_number&&max.First_number< max.Third_number){
            System.out.println("Najwiekasz liczba jest: "+max.Third_number);
        }

    }
    public static void Geometric_average(){
        Scanner scanner = new Scanner(System.in);
        Numbers geometric_average = new Numbers();

        System.out.println("wpisz pierwsza liczbe");
        geometric_average.First_number = scanner.nextInt();

        if (geometric_average.First_number<0){
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }

        System.out.println("wpisz druga liczbe");
        geometric_average.Second_number = scanner.nextInt();

        if (geometric_average.Second_number<0){
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }

        System.out.println("wpisz trzecia liczbe");
        geometric_average.Third_number = scanner.nextInt();

        if (geometric_average.Third_number<0){
            System.out.println("Wpisz liczbe wieksza od 0");
            System.exit(0);
        }
        int help= geometric_average.First_number*geometric_average.Second_number* geometric_average.Third_number;
        double geo_avg=Math.cbrt(help);
        int convert_to_int=(int)Math.round(geo_avg);
        System.out.println("Srednia geometryczna wynosi: "+convert_to_int);

    }

    public static void main(String[] args) {

        Sum();
        Average();
        Min();
        Max();
        Geometric_average();
    }

}