package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요. : ");
        int n =  scan.nextInt();

        for(int i = 1; i <= 9; i++){
            int mul = i * n;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
}
