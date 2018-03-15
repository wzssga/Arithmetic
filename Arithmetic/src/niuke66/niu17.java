package niuke66;

import java.util.Iterator;
import java.util.Stack;

public class niu17 {
	Stack<Integer> stack = new Stack<Integer>();

	public void push(int node) {
		stack.push(node);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	// 这样写iterater是错误的，
	//
	// public int min() {
	// int min = stack.peek();
	// Iterator<Integer> iterator = stack.iterator();
	// while(iterator.hasNext()) {
	// if (min>iterator.next()) {
	// min=iterator.next();//错误点：iterator.next()又会调用下一个
	// }
	// }
	// return min
	//
	// }
	
	
	//正确写法：用temp接受iterator.next();用来比对传值
	public int min() {
		int min = stack.peek();
		int temp = 0;
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (min > temp) {
				min = temp;
			}
		}
		return min;
	}
}
