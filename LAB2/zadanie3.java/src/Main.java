import java.util.Scanner;

public class Main {
    static class MyDate{
        int year=0,month=0,days=0;


    }
//    public static void IsDate(){
//        MyDate date = new MyDate();
//
//        if (date.days>31){
//            System.out.println("Nie ma takiej daty!");
//            System.exit(0);
//        }
//        if (date.month>12){
//            System.out.println("Nie ma takiego miesiaca");
//            System.exit(0);
//        }
//        if (date.year<1990 || date.year>2050){
//            System.out.println("Nie pasuje w krtyeria");
//            System.exit(0);
//        }
//
//    }

    public static void displayDate(){
        Scanner scanner = new Scanner(System.in);
        MyDate date = new MyDate();

        System.out.println("wpisz dzien");
        date.days = scanner.nextInt();

        System.out.println("wpisz miesiac ");
        date.month = scanner.nextInt();

        System.out.println("wpisz rok");
        date.year = scanner.nextInt();
        if (date.days>31){
            System.out.println("Nie ma takiej daty!");
            System.exit(0);
        }
        if (date.month>12){
            System.out.println("Nie ma takiego miesiaca");
            System.exit(0);
        }
        if (date.year<1990 || date.year>2050){
            System.out.println("Nie pasuje w krtyeria");
            System.exit(0);
        }
        //IsDate();
        if (date.month<10 && date.days<10){
            System.out.println("0"+date.days+"/0"+date.month+"/"+date.year);
            System.exit(0);
        }if (date.days<10){
            System.out.println("0"+date.days+"/"+date.month+"/"+date.year);
            System.exit(0);
        }if (date.month<10){
            System.out.println(date.days+"/0"+date.month+"/"+date.year);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
    displayDate();
    }
}