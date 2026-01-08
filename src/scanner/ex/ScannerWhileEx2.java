package scanner.ex;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("상품의 가격을 입력하세요. (-1을 입력하면 종료) : ");
            int price = scan.nextInt();
            if(price == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("구매하려는 수량을 입력하세요. : ");
            int quantity = scan.nextInt();
            System.out.println("총 비용 : " + price*quantity + "원입니다.");
        }
    }
}
