package niuke66;

import java.util.Stack;

/*输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是
 * 该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * 注意：这两个序列的长度是相等的）*/
/* 【思路】借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，然后判断栈顶元素是不是
 * 出栈顺序的第一个元素，这里是4，很显然1≠4，所以我们继续压栈，直到相等以后开始出栈，出栈一个元素，
 * 则将出栈顺序向后移动一位，直到不相等，这样循环等压栈顺序遍历完成，如果辅助栈还不为空，说明弹出序列
 * 不是该栈的弹出顺序。
举例：
入栈1,2,3,4,5
出栈4,5,3,2,1
首先1入辅助栈，此时栈顶1≠4，继续入栈2
此时栈顶2≠4，继续入栈3
此时栈顶3≠4，继续入栈4
此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3
此时栈顶3≠5，继续入栈5
此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3
….
依次执行，最后辅助栈为空。如果不为空说明弹出序列不是该栈的弹出顺序。 */
public class niu18 {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length==0||popA.length==0||(pushA.length!=popA.length)) {
			return false;
		}
		Stack<Integer> helpStack = new Stack<Integer>();
		int index=0;//关键点：index记录popA的下个出栈的数组下标
		for (int i = 0; i < pushA.length; i++) {
			helpStack.push(pushA[i]);//先把pushA的第一个值存入helpStack栈，开始与popA[index]比对，查看是否该值现在出栈
			//若不是现在出栈，则继续讲pushA的下个值入栈，继续比对是否此值出栈
			
			while(!helpStack.isEmpty()&&helpStack.peek()==popA[index]) {
				index++;
				helpStack.pop();//若满足出栈顺序，则最终结果是：helpStack为空。
			}
		}
		return helpStack.isEmpty();//所以以helpStack是否为空作为最终判断是否能的条件
	}
}
