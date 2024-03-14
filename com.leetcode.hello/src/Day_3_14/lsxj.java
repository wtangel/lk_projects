package com.licou;
import java.util.Scanner;
//两数相加
// 定义一个名为numbers的整型数组
//int[] numbers;

// 初始化并赋值数组元素
//        numbers = new int[]{10, 20, 30};

// 输出数组元素
//        }



public class lsxj {
    public static void main(String[] args) {
        int[] nums;int y;int target;
        Scanner num = new Scanner(System.in);
        System.out.println("请输入元素的个数：");
        int x=num.nextInt();
        nums=new int[x];
        Scanner tar = new Scanner(System.in);
        System.out.println("请输入目标值：");
        target=tar.nextInt();
        if(x>=2&&x<=10000) {
            for (int i = 0;i<x; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入数组元素：");
                nums[i] = sc.nextInt();
            }
            for(int i=0;i<x-1;i++){
                for(int j=i+1;j<x;j++)
                {
                    y=nums[i]+nums[j];
                    if(y==target) {
                        System.out.println(i);
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
