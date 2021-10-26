package For;

import java.util.Scanner;

public class Main2439 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String star = "";
        int a = scn.nextInt();
        for (int i = a; i > 0  ; i--) {
            for (int j = 0; j < i-1 ; j++) {
                System.out.print(" ");
            }
            star += "*";
            System.out.println(star);
        }
    }
}
