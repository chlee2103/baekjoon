package If;

import java.util.Scanner;

public class Main9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num >= 90 && num <= 100){
            System.out.println("A");
        }else if(num >= 80 && num <= 89){
            System.out.println("B");
        }else if(num >= 70 && num <= 79){
            System.out.println("C");
        }else if(num >= 60 && num <= 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
