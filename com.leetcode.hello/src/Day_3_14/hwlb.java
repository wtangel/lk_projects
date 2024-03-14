package Day_3_14;

public class hwlb {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    class Solution {
//        public boolean isPalindrome(ListNode head) {
//            ListNode LT=head;int sum=0;
//            for(;LT!=null;LT=LT.next){
//                sum++;
//            }
//            if(sum==1) return true;
//            int[] nums=new int[sum];LT=head;
//            for(int i=0;LT!=null;LT=LT.next)
//            {nums[i]=LT.val;i++;}
//            // if(sum==2) {
//            //     if(nums[0]==nums[1]) return true;
//            //     else return false;
//            // }
//            int i=0;int j=sum-1;
//            while(true)
//            {
//                if(nums[i]!=nums[j])
//                    return false;
//                i++;j--;
//                if(i==sum/2)
//                    break;
//            }
//            return true;
//        }
    //}
}
