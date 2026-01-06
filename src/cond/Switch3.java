package cond;

public class Switch3 {
    //break가 없는 경우
    public static void main(String[] args){
        int grade = 2;

        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;
                break;

            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
        // break가 없는 경우에는 그 다음 것도 실행이 된다.
    }
}
