package designpattern.strategy;

public class CalPrice {
    private MemberStartegy startegy;

    public CalPrice(MemberStartegy startegy) {
        this.startegy = startegy;
    }

    // 封装结果的输出
    public double quote(double bookPrice) {
        return startegy.memberPrice(bookPrice);
    }

    public static void main(String[] args) {

        double vookPrice = 1234;
        CalPrice calPrice = new CalPrice(new OneLevelMember());
        double dddp = calPrice.quote(vookPrice);
        System.out.println("应付钱：" + dddp);
        calPrice = new CalPrice(new TwoLevelMember());
        dddp = calPrice.quote(vookPrice);
        System.out.println("应付钱：" + dddp);

    }
}
