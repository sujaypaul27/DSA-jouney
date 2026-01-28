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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList <>();
        queue.offer(root);
       
        while(!queue.isEmpty()){
            int top=queue.size();
             ArrayList<Integer> values=new ArrayList<>();
             for(int i=0;i<top;i++){
                TreeNode Node = queue.poll();
                values.add(Node.val);
                if(Node.left !=null){
                    queue.offer(Node.left);
                }
                 if(Node.right !=null){
                    queue.offer(Node.right);
                }



             }
             result.add(values);

        }
        return result;

        
    }
}