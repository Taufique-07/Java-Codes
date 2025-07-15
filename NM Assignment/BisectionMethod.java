import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Scanner;

public class BisectionMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Function f(x) using only x.");
        System.out.println("Use ^ for powers, Example : (x^3, e^x,2*x^2 - 1)");
        System.out.println("You can use standard functions like sin(x), cos(x), log(x), etc.");

        System.out.print("Enter your Function f(x) : ");
        String func = scanner.nextLine();

        System.out.print("Enter Interval a : ");
        double a = scanner.nextDouble();

        System.out.print("Enter Interval b : ");
        double b = scanner.nextDouble();

        // To convert the string into an understandable equation
        Expression expression = new ExpressionBuilder(func).variable("x").build();

       // To check f(a) & f(b) values
        System.out.printf("f(a) = %.6f, f(b) = %.6f\n",evaluate(expression,a),evaluate(expression,b));

        //  To check if f(a) & f(b) are opposite sign
        if (!hasOppositeSign(expression,a,b)) {
            System.out.println("f(a) and f(b) must have opposite signs.Otherwise no root guaranteed.");
            return;
        }

        System.out.println("f(a) and f(b) are opposite signs. So Bisection Method is Possible.");
        // Calling Bisection Method
        bisection(expression, a, b);

    }

    // Method for checking if f(a) & and f(b) are opposite
    public static boolean hasOppositeSign(Expression exp, double a, double b) {
        return evaluate(exp,a) * evaluate(exp,b) < 0;
    }

    // Method for Calculating f(a) & and f(b)
    public static double evaluate(Expression exp, double x) {
        return exp.setVariable("x", x).evaluate();
    }

    // Main part of the Bisection Method
    public static void bisection(Expression exp, double a, double b) {
        double epsilon = 1e-3;
        double fa = evaluate(exp,a);
        double fb = evaluate(exp,b);

        double c = a;

        int iteration = 0;   // To calculate total iteration

        while (Math.abs(b-a) >= epsilon) { // to check a & b difference are grater than the limit
            c = (a + b) / 2;               // here limit means epsilon
            double fc = evaluate(exp,c);
            iteration++;

            if (Math.abs(fc) <  epsilon) {  // Checking value of f(c) to terminate the loop
                break;
            }

            if (fa * fc < 0) {     // Replacing the value of b & f(b)
                b = c;
                fb = fc;
            } else {              // Replacing the of  a & f(a)
                a = c;
                fa = fc;
            }
        }

        System.out.printf("Root ≈ %.7g\n", c);    // Showing the root
        System.out.println("Total iterations: " + iteration);

    }
}
