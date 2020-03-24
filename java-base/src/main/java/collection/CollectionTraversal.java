package collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 集合遍历
 * @author heshuzhuang
 * @Date 2020/3/24 10:08
 */
public class CollectionTraversal {


	public static void main(String[] args) {

		// java 8 中的流式api
		List ones = new ArrayList();
		ones.add("马");
		ones.add("化");
		ones.add("腾");
		ones.stream().forEach(System.out::println);
	}


}
