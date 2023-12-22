import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        try {
            int n1, n2, ans;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter two numbers:");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            
            System.out.println("Enter the operator {/,*,-,+}");
            String operator = sc.next();  // Use next() to read a String
            
            switch (operator) {
                case "+":
                    ans = n1 + n2;
                    break;
                case "-":
                    ans = n1 - n2;
                    break;
                case "/":
                    if (n2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    ans = n1 / n2;
                    break;
                case "*":
                    ans = n1 * n2;
                    break;
                default:
                    System.out.println("ERROR: Invalid operator");
                    return;
            }
            
            System.out.println("ANSWER IS: " + ans);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
