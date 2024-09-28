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

    public static float getMax(float args[]) {
        float max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max)
                max = args[i];
        }
        return max;
    }

    public static int countNumericalCharacter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                count++;
        }
        return count;
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

    public static void run_p03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        float args[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element: ");
            args[i] = sc.nextFloat();
        }
        sc.close();
    }

    public static void run_p04() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        System.out.println("Number of numerical characters: " + countNumericalCharacter(s));
    }
}