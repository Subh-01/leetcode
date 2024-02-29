/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int level=0;
        
while(!q.isEmpty()){
    int prevOdd = Integer.MAX_VALUE, prevEven = Integer.MIN_VALUE;//starting values accoding to level
    
    for(int i=q.size();i>0;i--){
                TreeNode curr=q.poll();
         if(curr.val%2 == level%2) return false;  //if level and current value are same either evenorodd
                
if(level%2==1){   //odd level
          if(prevOdd<=curr.val) return false;     //strictly increasing 
       prevOdd = curr.val;//udpate previous value
} else {
    if(prevEven>=curr.val)  return false;     // strictly decs
    prevEven = curr.val;
}
                
        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);  
        }
            level++;
            
    }
        return true;
}
}