package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2*3 2차원 배열
        int [][] arr = new int[2][3];
        int a =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a++;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
