package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("changeNumber 호출 전, number: " + number);
        number = changeNumber(number);
        System.out.println(" changeNumber 호출 후, number" + number);
    }
    public static int changeNumber(int num2) {
//        System.out.println("2. changeNumber 변경전, number: " + number);
//        number = number * 2;
//        System.out.println("3. changeNumber 변경 후, number: " + number);
          num2 = num2 *2;
                  return num2;
    }
}
