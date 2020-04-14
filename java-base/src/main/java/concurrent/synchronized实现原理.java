package concurrent;

/**
 * 命名不规范哈
 * 用来做记录
 *
 * 文章地址记录： http://cmsblogs.com/?p=2071
 * @author heshuzhuang
 * @Date 2020/4/14 13:48
 */
public class synchronized实现原理 {

	/**
	 * 1.修饰方法 （锁是当前实例对象）
	 * 2.修饰代码块 （锁是括号里面的对象）
	 * 3.修饰静态方法（类的所有对象）
	 * 4.修饰类实例（类中所有对象公用一把锁）
	 * synchronized，重量级锁 关键字不可继承，子类若是想实现同步也需要加上修饰
	 *
	 * java 对象头{
	 *      mark word(标记字段)：存储对象运行时数据
	 *      klass Pointer(类型指针)：虚拟机通过这个指针来确定这个对象是哪个类的实例
	 *                 }
	 * Monitor：Monitor 是线程私有的数据结构，每一个线程都有一个可用monitor record列表，
	 *          同时还有一个全局的可用列表。每一个被锁住的对象都会和一个monitor关联（对象头的MarkWord中的LockWord指向monitor的起始地址），
	 *          同时monitor中有一个Owner字段存放拥有该锁的线程的唯一标识，表示该锁被这个线程占用。
	 *          其组成部分——
	 *          Owner：初始时为NULL表示当前没有任何线程拥有该monitor record，当线程成功拥有该锁后保存线程唯一标识，当锁被释放时又设置为NULL；
	 *          EntryQ:关联一个系统互斥锁（semaphore），阻塞所有试图锁住monitor record失败的线程。
	 *          RcThis:表示blocked或waiting在该monitor record上的所有线程的个数。
	 *          Nest:用来实现重入锁的计数。
	 *          HashCode:保存从对象头拷贝过来的HashCode值（可能还包含GC age）。
	 *          Candidate:用来避免不必要的阻塞或等待线程唤醒，因为每一次只有一个线程能够成功拥有锁，如果每次前一个释放锁的线程唤醒所有正在阻塞或等待的线程，会引起不必要的上下文切换（从阻塞到就绪然后因为竞争锁失败又被阻塞）从而导致性能严重下降。Candidate只有两种可能的值0表示没有需要唤醒的线程1表示要唤醒一个继任线程来竞争锁。
	 *
	 *
	 *
	 *
	 *
	 */
	public synchronized void method1(){

	}
	public void method(){
		synchronized (this){

		}
	}







}
