package InputNOutputNArithmetic;

import java.util.Scanner;

public class Main2588 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = a*(b%10);       // 1의자리
        int d = a*((b%100)/10); // 10의자리
        int e = a*(b/100);      // 100의자리
        int f = a*b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
