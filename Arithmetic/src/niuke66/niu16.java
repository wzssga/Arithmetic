package niuke66;


public class niu16 {

    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
		TreeNode temp=null;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
        
		if (root.left!=null) {
			Mirror(root.left);
		}
		if (root.right!=null) {
			Mirror(root.right);
		}
		
	}

	
}
