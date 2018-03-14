package niuke66;

import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class niu3 {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> nodeList = new ArrayList<Integer>();
		ListNode p = listNode;
		xx(nodeList, p);
		return nodeList;
	}
	public void xx(ArrayList<Integer> al,ListNode n){
		if (n!=null) {
            xx(al, n.next);
			al.add(n.val);	
		}
	}
	
	
}
