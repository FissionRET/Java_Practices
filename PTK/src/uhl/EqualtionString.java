package uhl;

import java.util.Scanner;

public class EqualtionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau phep toan: ");
        String x = sc.nextLine();
        sc.close();
        System.out.println(calculateEqualtionString(x));
    }

    private static int calculateEqualtionString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        String[] parts = inputString.split(" ");

        if (parts.length != 3) {
            return Integer.MIN_VALUE;
        }

        String op1 = parts[0], operator = parts[1], op2 = parts[2];

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
