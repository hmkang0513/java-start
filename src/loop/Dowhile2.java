package loop;

public class Dowhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while(i<3); // 처음부터 거짓이라고 최초 한 번은 실행됨
    }
}
