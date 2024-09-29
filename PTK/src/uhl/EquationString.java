package uhl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap xau phep toan: ");
        String x = sc.nextLine();
        sc.close();

        int res = calculateEquationString(x);

        if(res != Integer.MIN_VALUE) {
            System.out.println(res);
        } else {
            System.out.println("NaN");
        }
    }

    private static int calculateEquationString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        String regex = "(\\d+)([+\\-*/])(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString.trim().replaceAll(" ", ""));

        if (!matcher.matches()) {
            return Integer.MIN_VALUE;
        }

        String op1 = matcher.group(1);
        String operator = matcher.group(2);
        String op2 = matcher.group(3);

        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            return Integer.MIN_VALUE;
        }

        try {
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);

            return switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default -> Integer.MIN_VALUE;
            };
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }
}
