
import java.util.*;

public class Lab03 {

    static int sum(int a, int b) {
        return a+b;
    }

    static double sum(double a, double b) {
        return a+b;
    }

    static String sum(String a, String b) {
        return a + "+" +b;
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }

    static double sum(double a, double b, double c) {
        return a+b+c;
    }

    static String sum(String a, String b, String c) {
        return a + "+" + b +"+" + c;
    }

    // Non Static method

    int sum(int a, int b,int c,int d) {
        return a+b+c+d;
    }

    double sum(double a, double b,double c, double d) {
        return a+b+c+d;
    }

    String sum(String a, String b,String c, String d) {
        return a + "+" + b + "+" + c + "+" + d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String e = scanner.nextLine();
        String f = scanner.nextLine();

        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(sum(e,f));
        System.out.println(sum(a,b,c));
        System.out.println(sum(c,d,9.76));
        System.out.println(sum(e,f,"Check"));

        Lab03 lab = new Lab03();

        System.out.println(lab.sum(2,4,6,9));
        System.out.println(lab.sum(3.45,2.64,7.656,6.8));
        System.out.println(lab.sum("Rapi","Ziad","Bayzid","Taufique"));



    }
}