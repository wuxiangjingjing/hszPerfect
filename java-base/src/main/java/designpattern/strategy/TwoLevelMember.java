package designpattern.strategy;

/**
 * @author Rod
 */
public class TwoLevelMember implements MemberStartegy {
    @Override
    public double memberPrice(double price) {
        return 0.8 * price;
    }
}
