package uhl;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ky tu: ");
        String s = sc.next();
        System.out.println("So ky tu trong chuoi: " + countNumericalCharacters(s));
    }

    private static int countNumericalCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }
}
