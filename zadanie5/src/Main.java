import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int days = 0;
        String month= new String();

        System.out.println("Wpisz liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number>0 && number<13){
        switch (number) {
            case 1:
                 month="styczen";
                 days=31;

                break;
            case 2:
                 month="luty";
                 days=28;

                break;
            case 3:
                 month="marzec";
                 days=30;

                break;
            case 4:
                month="kwiecien";
                days=31;

                break;
            case 5:
                month="maj";
                days=30;

                break;
            case 6:
                month="czerwiec";
                days=31;

                break;
            case 7:
                month="lipiec";
                days=30;

                break;
            case 8:
                month="sierpien";
                days=30;

                break;
            case 9:
                month="wrzesien";
                days=31;

                break;
            case 10:
                month="pazdziernik";
                days=30;

                break;
            case 11:
                month="listopad";
                days=30;

                break;

            case 12:
                month="grudzien";
                days=31;

                break;



        }
        System.out.print(month+": "+days+" dni");

        }
        else{
            System.out.print("Podaj wartosc wieksza od 0 i mniejsza niz 13!");
            System.exit(0);
        }

    }
}