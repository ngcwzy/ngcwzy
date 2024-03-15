import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Plrase enter an expression using only parantheses");
        Scanner reader = new Scanner(System.in);
        String expression = reader.nextLine();
        BalancedParentheses balance = new BalancedParentheses();
        balance.balancedParentheses(expression);
        reader.close();
    }
}
