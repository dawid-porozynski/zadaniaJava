public class Main {
    public static void main(String[] args) {

        double pi = 3.14;
        double result = pi * pi;
        System.out.println(funct(result));
    }
    public static double funct(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

}
