package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println();
        System.out.print("두 번재 수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println();

        if(num1 > num2) {
            System.out.println("더 큰 수는 " + num1 +"입니다.");
        } else if (num1 < num2) {
            System.out.println("더 큰 수는 " + num2 +"입니다.");
        } else {
            System.out.println("두 수의 값이 같습니다.");
        }
    }
}
