package test;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heshuzhuang
 * @Date 2020/4/16 10:29
 */
public class Solution {

	public static void main(String[] args) {
		List<A> aList  = new ArrayList<>();
		for (int t = 4;t>0;t--){
			int i =0 ;
			A a = new A();
			a.setAge(11);
			a.setName("dsdsdsd" + i++ );
			aList.add(a);
		}


	}



}
@Data
class  A {
	private Integer age;

	private String name;

}