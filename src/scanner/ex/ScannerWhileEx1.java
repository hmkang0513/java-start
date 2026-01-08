package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("이름을 입력하세요. (종료를 입력하면 종료)");
            String name =  scan.nextLine();
            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
            System.out.print("나이를 입력하세요. (종료를 입력하면 종료) ");
            String age = scan.nextLine();

            // int age = input.nextInt();
            // nextInt의 경우 \n은 안 가져가서 다음 줄에 input.nextLine();을 더 작성하기
            if(age.equals("종료")){
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
        }
    }
}
