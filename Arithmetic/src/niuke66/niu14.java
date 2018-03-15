package niuke66;
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class niu14 {
public ListNode Merge(ListNode list1,ListNode list2) {
//        ListNode alListNode = new ListNode(-1);
//        alListNode.next=null;
//        ListNode root = alListNode;
//        root=alListNode;
//        while(list1!=null&&list2!=null) {
//        		if (list1.val<list2.val) {
//				alListNode.next=list1;//如果写成alListNode=list1，则是没有连起来的，下面的方法很重要，创建一个头结点，记录头结点
//				list1=list1.next;
//			}else {
//				alListNode.next=list2;
//				list2=list2.next;
//			}
//        		alListNode=alListNode.next;
//        		
//        		
//        }
//        if (list1!=null) {
//			alListNode.next=list1;
//		}
//        if (list2!=null) {
//        	alListNode.next=list2;
//		}
//        return root.next;
//    }
	

		//新建一个头节点，用来存合并的链表。
		        ListNode head=new ListNode(-1);
		        head.next=null;
		        ListNode root=head;
		        while(list1!=null&&list2!=null){
		            if(list1.val<list2.val){
		                head.next=list1;
		                head=head.next;
		                list1=list1.next;
		            }else{
		                head.next=list2;
		                head=head.next;
		                list2=list2.next;
		            }
		        }
		        //把未结束的链表连接到合并后的链表尾部
		        if(list1!=null){
		            head.next=list1;
		        }
		        if(list2!=null){
		            head.next=list2;
		        }
		        return root.next;
		    }
	
}
