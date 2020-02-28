package designpattern.strategy;

/**
 * @author Rod
 */
public class NormalMember implements MemberStartegy{
    @Override
    public double memberPrice(double price) {
        return price;
    }
}
