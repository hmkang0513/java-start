package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요. : ");
        int[] numbers;
        numbers = new int [5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력");
        for (int i = numbers.length -1; i>=0; i--){
            if(i != 0) {
                System.out.print(numbers[i] + ", ");
            } else if ( i == 0) {
                System.out.print(numbers[i]);

            }
        }
    }
}
