package fib;

/**
 * 斐波那契数 ： 当前位置的数据 = 其左前边的一个数 + 其前面的第二个数 eg: 0、 1、 1 、2 、3 、5 、 8 、 13 ...
 * 
 * @author bingbo
 * 
 */
public class FibDemo {

	/**
	 * 求斐波那契数
	 * 
	 * @param num 位置
	 * @return 斐波那契数
	 */
	public static long fib1(int num) {
		if (num <= 1) {
			return num;
		}
		return fib1(num - 1) + fib1(num - 2);
	}

	/**
	 * 求斐波那契数
	 * 
	 * @param num 位置
	 * @return 斐波那契数
	 */
	public static long fib2(int num) {
		if (num <= 1) {
			return num;
		}
		long firstNum = 0;
		long secondNum = 1;
		for (int i = 0; i < num - 1; i++) {
			long sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}
		return secondNum;
	}

	/**
	 * 求斐波那契数
	 * 
	 * @param num 位置
	 * @return 斐波那契数
	 */
	public static long fib3(int num) {
		if (num <= 1) {
			return num;
		}
		long firstNum = 0;
		long secondNum = 1;
		for (int i = 0; i < num - 1; i++) {
			secondNum = firstNum + secondNum;
			firstNum = secondNum - firstNum;
		}
		return secondNum;
	}

}
