package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        /*
        num1, num2, num3  int 변수를 선언 후 10, 20, 30으로 초기화
        세 변수의 합을 계산 후 sum이라는 이름의 int 변수에 저장
        세 변수의 평균을 계싼 후 average라는 이름의 int 변수에 저장,
        sum과 average 변수의 값을 출력
         */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
