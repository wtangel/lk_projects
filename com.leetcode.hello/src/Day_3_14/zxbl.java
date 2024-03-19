package Day_3_14;
//二叉树的中序遍历
public class zxbl {
    /*
    class Solution {
        //迭代
        public List<Integer> inorderTraversal(TreeNode root){
            List<Integer> res=new ArrayList<Integer>();
            Deque<TreeNode> stk=new LinkedList<TreeNode>();
            while(root!=null||!stk.isEmpty()){
                //root=null&&stk为空跳出循环
                while(root!=null){
                    stk.push(root);
                    root=root.left;
                }
                root=stk.pop();
                res.add(root.val);
                root=root.right;
            }
            return res;
        }
    }
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root==null)
        return ;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    */

}
