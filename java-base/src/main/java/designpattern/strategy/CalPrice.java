package designpattern.strategy;

/**
 * @author Rod
 */
public class CalPrice {
    private MemberStartegy startegy;

    public CalPrice(MemberStartegy startegy) {
        this.startegy = startegy;
    }

    public double quote(double bookPrice) {
        return startegy.memberPrice(bookPrice);
    }

    public static void main(String[] args) {

        double vookPrice = 1234;
        MemberStartegy memberStartegy = new OneLevelMember();
        CalPrice calPrice = new CalPrice(memberStartegy);
        double dddp = calPrice.quote(vookPrice);
        System.out.println("应付钱：" + dddp);
        calPrice = new CalPrice(new TwoLevelMember());
        dddp = calPrice.quote(vookPrice);
        System.out.println("应付钱：" + dddp);

    }
}
