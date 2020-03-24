package collection;

import java.util.*;

/**
 * list 相关 底层数据结构是数组
 * 当list 中元素过多时，不指定位置的操作新增或者删除操作，效率是高的，但是当指定位置时，尤其是当删除或者新增的
 * 元素很靠前时，效率较低   浪费时间较长
 *
 *
 * 在下面的注释中有歧义的原因是    数组在不指定具体的增删位置时   也很快，链表在数据量较大时，对中间部分的增删也是比较慢的。
 *
 *
 * @author heshuzhuang
 * @Date 2020/3/24 9:25
 */

public class CollectionsAbout {

	/**
	 * 1.List 接口
	 *
	 * 有序的  可以重复的集合   常用的实现类   arrayList(基于数组)与LinkedList（基于链表）
	 * 若知道集合的长度     最好初设结合大小值  减小开销
	 * 线程不安全
	 *
	 */
	List  A = new ArrayList(11);

	/**
	 * 底层数据结构  数组（查询块  增删慢——有歧义，需要看具体的情况）   线程安全   效率低   耗性能
	 */
	List vector = new Vector();
	/**
	 * 底层数据结构是链表，查询慢，增删快（有歧义，需要看具体的情况），线程不安全，效率高
	 *
	 */
	List linkedList = new LinkedList();


	/**
	 * 2.Set 接口
	 *
	 * 无序的  不可重复的集合
	 *
	 * 元素无序，不可重复，线程不安全，集合元素可以为 NULL
	 *
	 */
	Set hashSet = new HashSet();
	/**
	 * 底层采用链表和哈希表的算法，保证元素有序，唯一性（即不可以重复，有序），线程不安全
	 *
	 */
	Set linkedHashSet = new LinkedHashSet();
	/**
	 * 底层使用红黑树算法，擅长于范围查询，元素有序，不可重复，线程不安全
	 *
	 */
	Set treeSet = new TreeSet();


	/**
	 *  3. Map 接口
	 *
	 *  key-value的键值对，key不允许重复，value可以，key-value通过映射关系关联，常用实现类HashMap和TreeMap；
	 *
	 */

	// 采用哈希表算法，key无序且不允许重复，key判断重复的标准是：key1和key2是否equals为true，并且hashCode相等
	Map<String, String> hashMap = new HashMap<String, String>();
	// 采用红黑树算法，key有序且不允许重复，key判断重复的标准是：compareTo或compare返回值是否为0
	Map<String, String> treeMap = new TreeMap<String, String>();






}
