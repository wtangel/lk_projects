package Day_3_14;
//二叉树的最大深度
public class zdsd {
    //public int maxDepth(TreeNode root) {
        //if (root == null)
          //  return 0;
        // 深度优先
        /*else {
            int leftHeight=maxDepth(root.left);
            int rightHeight=maxDepth(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }*/
        //广度优先
        /*Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int ans=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                TreeNode node=queue.poll();
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                size--;
            }
            ans++;
        }
        return ans;
    }

    }*/
}
