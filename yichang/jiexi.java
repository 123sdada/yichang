package yichang;

import java.util.ArrayList;
import java.util.Scanner;

public class jiexi extends Exception{
    private int a;
    ArrayList<Integer>al=new ArrayList<Integer>();
    public void add(int val){
        al.add(val);
    }
}


class TestDemo01 {
    public static void main(String args[]){

        jiexi jx=new jiexi();
        Scanner sn=new Scanner(System.in);

        try {
            jx.add(sn.nextInt());
        } catch (RuntimeException e) {
            System.out.println("程序运行出错,输入的值无法进行解析！");
            //System.exit(1) ;			// 程序退出
        }
        System.out.println("11231231");
    }
}