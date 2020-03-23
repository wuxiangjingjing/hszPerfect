package designpattern.strategy;

/**
 *
 * 策略模式   小demo
 * @author heshuzhuang
 * @Date 2020/3/23 13:52
 */
public class StrategyPattern {

	/**
	 * 测试不同的实现，在实际应用中多是控制层调用
	 * @param args
	 */
	public static void main(String[] args) {
		Config c = new Config( new A());
		c.hahah();

	}

}

/**
 * 定义一个接口  会有不同的实现类，策略的选择  具体的接口实现
 */
interface Heshuzhuang{
	void sayHelloWorld();
}

/**
 * 不同的实现类    来实现不同的策略
 */
class A implements  Heshuzhuang{

	@Override
	public void sayHelloWorld() {
		System.out.print("执行了A方法");
	}
}

class B implements  Heshuzhuang{

	@Override
	public void sayHelloWorld() {
		System.out.print("执行了B方法");
	}
}
// 环境配置类

class Config {
	private Heshuzhuang heshuzhuang;

	public  Config(Heshuzhuang heshuzhuang){
		this.heshuzhuang = heshuzhuang;
	}

	public void hahah(){
		heshuzhuang.sayHelloWorld();
	}

}




