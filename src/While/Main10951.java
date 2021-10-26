package While;



/*
문제
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
*/
import java.util.Scanner;

public class Main10951 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()){ // hasNextInt() : 정수가 들어오지 않으면 false 반환
            int a = scn.nextInt();
            int b = scn.nextInt();

            System.out.println(a+b);
        }
    }
}