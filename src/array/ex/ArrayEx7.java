package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int [][] score = new int[4][3];
        
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < score.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.: ");
            for(int j=0; j < score[i].length; j++){
                if(j == 0) {
                    System.out.print("국어 점수 : " );
                    score[i][j] = scan.nextInt();
                } else if (j == 1){
                    System.out.print("영어 점수 : " );
                    score[i][j] = scan.nextInt();
                } else if  (j == 2){
                    System.out.print("수학 점수 : " );
                    score[i][j] = scan.nextInt();
                }
            }
        }
        int sum = 0;
        double average = 0;
        for(int i =0; i< score.length; i++){
            for(int j =0; j<score[i].length; j++){
                sum += score[i][j];
            }
            average =  (double)sum/score[i].length;
            System.out.println((i+1)+"번 학생의 점수 총점은 " + sum +"입니다.");
            System.out.println((i+1)+"번 학생의 점수 평균은 " + average + "입니다.");
            sum = 0;

        }
    }
}
