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
		int sumThree = sortedNums[0]+sortedNums[1]+sortedNums[2];


		Arrays.stream(sortedNums).forEach(System.out::println);
		return lists;
	}
}
