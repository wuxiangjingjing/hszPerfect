package designpattern.strategy;

/**
 *
 */
public class NormalMember implements MemberStartegy{
    @Override
    public double memberPrice(double price) {
        return price;
    }
}
