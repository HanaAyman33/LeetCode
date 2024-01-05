public class InvertTree {
	 public TreeNode invertTree(TreeNode root) {
	        if(root==null)
	            return root;
	        invertTree(root.left);
	        invertTree(root.right);
	        TreeNode cur = root.left;
	        root.left = root.right;
	        root.right = cur;
	        return root;
	    }
}
