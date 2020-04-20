package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author heshuzhuang
 * @Date 2020/4/16 10:29
 */
public class Solution {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 0, -1, 0, -2, 2};
		fourSum(nums,0);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> listInteger = new ArrayList<>();
		int[] sortedNums = Arrays.stream(nums).sorted().toArray();
		int length = sortedNums.length/2;
		System.out.println("中间下标" + length);
		if (sortedNums.length%2!=0){



		} else {

		}





		//元素生成四位数组且不重复




		Arrays.stream(sortedNums).forEach(System.out::println);
		return lists;
	}
}
