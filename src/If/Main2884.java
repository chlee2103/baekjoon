package If;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int minus = min-45;
        if(minus < 0){
            if(hour != 0) {
                hour -= 1;
                minus += 60;
            }else{
                hour = 23;
                minus += 60;
            }
        }
        System.out.println(hour+" "+minus);
    }
}
