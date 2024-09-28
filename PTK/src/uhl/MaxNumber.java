package uhl;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thuc a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Nhap so thuc a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Nhap so thuc a3: ");
        double a3 = sc.nextDouble();

        double max = a1;

        if(a2 > max) {
            max = a2;
        }
        if(a3 > max) {
            max = a3;
        }

        System.out.print("So lon nhat la: " + max);
    }
}
