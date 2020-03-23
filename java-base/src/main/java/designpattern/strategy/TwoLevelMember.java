package designpattern.strategy;

/**
 *
 */
public class TwoLevelMember implements MemberStartegy {
    @Override
    public double memberPrice(double price) {
        return 0.8 * price;
    }
}
