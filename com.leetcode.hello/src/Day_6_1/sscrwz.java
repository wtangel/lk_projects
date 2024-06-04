package Day_6_1;

public class sscrwz {
    public int searchInsert(int[] nums, int target) {
        int num=nums.length,low=0,height=num-1;
        while(low<=height){//设定循环跳出条件
            int mid=(low+height)/2;
            if(target<nums[mid]){//目标值小于中值，将height设为mid-1
                height=mid-1;
            } else if(target>nums[mid]){//目标值大于中值，将low设为mid+1
                low=mid+1;
            } else return mid;
        }
        return low;
    }
}
