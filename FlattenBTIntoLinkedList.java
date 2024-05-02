
public class FlattenBTIntoLinkedList {
	    public void flatten(TreeNode root) {
	       if(root == null)
	            return ;
	        flatten(root.getLeft());
	        if(root.left != null){
	            TreeNode node = root.right;
	            root.setRight(root.left);
	            root.setLeft(null);
	            TreeNode temp = root;
	            while(temp.right != null){
	                temp = temp.right;
	            }
	            temp.setRight(node);
	        }
	        flatten(root.right);
	    }
	}
