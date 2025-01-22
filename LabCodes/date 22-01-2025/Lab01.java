import java.util.*;

public class Lab01 {

  // Function for checking an user inputed number is prime or not
    public static void primeCheck(int p) {

        if (p < 2){
            System.out.println(p + " is not a Prime Number.");
            return;
        }
        boolean isPrime = true;
        for(int i=2 ; i<=Math.sqrt(p); i++) {
            if (p%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(p+" is a Prime Number.");
        }
        else {
            System.out.println(p + " is not a Prime Number.");
        }
    }

  // To find the largest number from given numbers
    public static int largestNumber() {
        int a = 7, b = 11, c = 2;
        int biggest ;

        if (a > b && a > c) {
            biggest = a;
        } else if (b >a && b > c) {
            biggest = b;
        }
        else {
            biggest = c;
        }
        return biggest;
    }

  // Create a multiplication table from given number
    public static void multiplication() {
        int num = 25;
        for (int i=1; i<=10; i++) {
            System.out.println(num+" X "+i+" = "+ (num*i));
        }
    }

  // Sum of 1 to 100 natural numbers
    public static int naturalSum() {
        int naturalSum = 0;

        for (int i=1; i<=100; i++) {
            naturalSum += i;
        }
        return naturalSum;
    }

  // Sum & average of all the elements of a given array
    public static void sumAvg(int [] array) {
        int sum = 0;
        double avg ;

        for (int j : array) {
            sum += j;
        }
        avg = (double)sum/array.length;
        System.out.println("Sum of Array : "+sum);
        System.out.println("Avarage of the array : "+avg);
    }

  // Calculate the sum of the odd numbers in a given array
    public static int oddSum(int [] array) {
        int oddSum = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                oddSum += j;
            }
        }
        return oddSum;
    }

  // Calculate the sum of the even numbers in a given array
    public static int evenSum(int [] array) {
        int evenSum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                evenSum += j;
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = {5,7,8,11,17,40};

        int evenSum = evenSum(array);
        int oddSum = oddSum(array);
        sumAvg(array);
        System.out.println("Even Sum : "+evenSum);
        System.out.println("Odd Sum : "+oddSum);
        int naturalSum = naturalSum();
        System.out.println("Natural sum : "+naturalSum);
        multiplication();
        int largeNumber =  largestNumber();
        System.out.println("Large Number : "+largeNumber);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        primeCheck(number);

    }
}
