package PhamQuangSang;

import java.util.Scanner;

public class p_28092024 {
    public static boolean checkLowerChar(char c) {
        if (c < 'a' || c > 'z')
            return false;
        return true;
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
}