package uhl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap xau phep toan: ");
        String x = sc.nextLine();
        sc.close();

        System.out.println(evaluateComparisonString(x));
    }

    private static boolean evaluateComparisonString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return false;
        }

        String regex = "(\\d+)(<=|>=|==|<|>|=)(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString.trim().replaceAll(" ", ""));

        if (!matcher.matches()) {
            return false;
        }

        String op1 = matcher.group(1);
        String operator = matcher.group(2);
        String op2 = matcher.group(3);

        if (!operator.equals("<") && !operator.equals(">") && !operator.equals("=") && !operator.equals("<=") && !operator.equals(">=")) {
            return false;
        }

        try {
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);

            return switch (operator) {
                case "<" -> num1 < num2;
                case ">" -> num1 > num2;
                case "=" -> num1 == num2;
                case "<=" -> num1 <= num2;
                case ">=" -> num1 >= num2;
                default -> false;
            };
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
