package niuke66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.javafx.animation.TickCalculation;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。

//层次遍历
public class niu19 {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();//注意此处quene 如何创建
		//LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
		if (root!=null) {
			queue.add(root);
		}
		while(!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			result.add(t1.val);
			if (t1.left!=null) {
				queue.add(t1.left);
			}
			if (t1.right!=null) {
				queue.add(t1.right);
			}
		}
		return result;
	}

}
