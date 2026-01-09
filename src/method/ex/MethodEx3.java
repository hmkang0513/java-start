package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(1000,balance);
        balance = withdraw(2000,balance);
    }

    public static int deposit(int amount, int balance) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원을 입금하셨습니다. 현재잔액 : " + balance + "원");
        } else {
            System.out.println("입금할 수 없습니다.");
        }
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if(amount <= 0) {
            System.out.println("출금 금액은 0보다 커야 합니다.");
            return balance;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
