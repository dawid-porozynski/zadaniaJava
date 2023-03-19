import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            isFriendly();


    }

    public static void isFriendly() {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int sum_B=0;
        int sum_A=0;

        for(int i=1;first>i;i++)
        {
            if(first%i==0)
                sum_A+=i;
        }

        for(int i=1;second>i;i++)
        {
            if(second%i==0)
                sum_B+=i;
        }
        if (sum_A == second && sum_B ==first){
            System.out.println("TAK");

        }else {
            System.out.println("NIE");
        }





    }


}