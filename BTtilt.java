class SoluBTtilttion {
    int tilt = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return tilt;
     }
    public int sum(TreeNode root){
        if(root==null)
            return 0;
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        tilt+=Math.abs(lsum-rsum);
        return lsum+rsum+root.val;
    }
}