package PhamQuangSang;

import java.util.Scanner;

public class p_28092024 {
    public static boolean checkLowerChar(char c) {
        if (c < 'a' || c > 'z')
            return false;
        return true;
    }

    public static boolean checkNumericalString(String s) {
        if (s.isEmpty()) {
            return false;
        }

        int i = 0;
        if (s.charAt(i) == '-') {
            i++;
        }

        boolean hasDigitsBeforeDecimal = false;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            hasDigitsBeforeDecimal = true;
            i++;
        }

        if (i < s.length() && s.charAt(i) == '.') {
            i++;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                i++;
            }
        }

        if (i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
            if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                i++;
            }
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                i++;
            }
        }

        return i == s.length() && hasDigitsBeforeDecimal;
    }

    public static void run_p01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        sc.close();
        if (checkLowerChar(c))
            System.out.println(c + "is a lowercase");
        else
            System.out.println(c + "is not a lowercase");
    }

    public static void run_p02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        if (checkNumericalString(s))
            System.out.println(s + "is a numerical string");
        else
            System.out.println(s + "is not a numerical string");
    }
}