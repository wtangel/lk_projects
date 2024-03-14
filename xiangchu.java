package com.licou.test;
import java.util.Scanner;
public class xiangchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;int b=0;
        System.out.print("请输入被除数: ");
        int num1 = scanner.nextInt();
        if(num1<0) a=-num1;
        else a=num1;
        System.out.print("请输入除数: ");
        int num2 = scanner.nextInt();
        if(num2<0) b=-num2;
        else b=num2;
        System.out.println(a);
        int k=a;int i=0;
        for (;k>=b;i++) {
            k=k-b;
            //System.out.println(k);
        }
        if(num1>0&&num2>0||num1<0&&num2<0)
            System.out.println(i);
        else System.out.println(-i);
    }
    }
