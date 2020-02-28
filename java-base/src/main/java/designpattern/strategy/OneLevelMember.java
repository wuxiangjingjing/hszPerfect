package designpattern.strategy;

/**
 * @author Rod
 */
public class OneLevelMember implements MemberStartegy {
    @Override
    public double memberPrice(double price) {
        return 0.9 * price;
    }
}
