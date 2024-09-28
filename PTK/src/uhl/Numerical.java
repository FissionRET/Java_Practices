package uhl;

import java.util.Scanner;

public class Numerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();
        sc.close();

        System.out.println(checkNumericalString(num));
    }

    private static boolean checkNumericalString(String inputString) {
        try {
            Double.parseDouble(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
