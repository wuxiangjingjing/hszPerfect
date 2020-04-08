package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * 用于stream流式api的使用demo
 *
 * @author heshuzhuang
 * @Date 2020/4/8 9:29
 */
public class StreamDemo {
	/**
	 * 基础介绍
	 *
	 * Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象
	 * Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
	 * 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
	 * 元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
	 *
	 *  +--------------------+       +------+   +------+   +---+   +-------+
	 *  | stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
	 *  +--------------------+       +------+   +------+   +---+   +-------+
	 *
	 */

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Person person = null;
		Random random = new Random();
		
		for(int i = 0;i<50;i++){
			person = new Person();
			person.setName("hsz" + i);
			person.setWeight(random.nextInt(5));
			personList.add(person);
		}
		// 对于Comparator   介绍见https://www.jianshu.com/p/3f621e51f306
        // Java8 中 Comparator 接口提供了一些静态方法，可以方便于我们进行排序操作
		Integer i = personList.stream()
				/**
				 * filter 过滤出集合中符合条件的元素
				 */
				.filter(e->e.getWeight() > 0)
				/**
				 * sorted 对集合按照weight进行排序
				 */
				.sorted(Comparator.comparingInt(Person::getWeight))

				/**
				 * 转成int 类型   （语法糖）
				 */
				.mapToInt(Person::getWeight)
				/**
				 * 聚合函数
				 */
				.sum();
				// 二者结果相同
				personList.forEach(e-> System.out.println(e.toString()));
				personList.forEach(System.out::println);
				System.out.println( "盒数" + i);



		List<Person> personList2 = new ArrayList<>();
		Person person1 = null;
		for(int n = 0;n<50;n++){
			person1 = new Person();
			person1.setName("xj" + n);
			person1.setWeight(random.nextInt(5));
			personList2.add(person1);
		}

		List<String> nameList = Stream.of(personList,personList2)
				/**
				 * 将多个Stream连接成一个Stream
				 */
				.flatMap(Collection::stream)
				/**
				 * map装换类型值，
				 * flatMap 将多个Stream连接成一个Stream，这时候不是用新值取代Stream的值，与map有所区别，这是重新生成一个Stream对象取而代之。
				 */
				.map(Person::getName)
				/**
				 * stream.collect() 的本质由三个参数构成,
				 * 1. Supplier 生产者, 返回最终结果
				 * 2. BiConsumer<R, ? super T> accumulator 累加器
				 * 第一个参数是要返回的集合, 第二个参数是遍历过程中的每个元素,
				 * 将流中每个被遍历的元素添加到集合中
				 * 3. BiConsumer<R, R> combiner 合并器, 在有并行流的时候才会有用, 一个流时代码不会走到这里
				 * 将第二步遍历得到的所有流形成的list都添加到最终的list中,
				 * 最后返回list1
				 */
				.collect(Collectors.toList());
//		nameList.forEach(System.out::println);
		System.out.println("" + nameList.toString());

	}


}


// 测试类
class Person{
	private String name;

	private Integer weight;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", weight=" + weight +
				'}';
	}
}



