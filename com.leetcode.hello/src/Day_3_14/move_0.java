package Day_3_14;
import java.util.Scanner;
//移动0
public class move_0 {
    public static void main(String[] args) {
        System.out.println("请输入数组元素的个数：");
        Scanner num = new Scanner(System.in);
        int count = num.nextInt();
        int [] nums = new int[count];
        int [] arr = new int [count];
        int j=0;
        for (int i = 0; i < count; i++) {
            System.out.println("请输入数组元素：");
            Scanner sc = new Scanner(System.in);
            nums[i] = sc.nextInt();
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (;j<count;j++) {
            nums[j]=0;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]);
        }
    }
}
