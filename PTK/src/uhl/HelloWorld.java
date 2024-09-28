package uhl;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kiem tra chu cai thuong: ");
        char a = sc.next().charAt(0);
        sc.close();

        System.out.println(checkLowerChar(a));
    }

    private static boolean checkLowerChar(char inChar) {
        return inChar >= 'a' && inChar <= 'z';
    }
}
