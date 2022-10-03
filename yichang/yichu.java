package yichang;

import java.util.Scanner;

public class yichu {
    private int a;
    private int b;


    public double add(double a, double b) throws yichuException {
        if (a + b > 99999999 || a + b < -99999999) {
            throw new yichuException("程序运行错误，数据溢出");
        } else {
            return a + b;
        }
    }

    public void input(double a) throws yichuException {
        if (a > 99999999 || a < -99999999) {
            throw new yichuException("程序运行错误，数据溢出");
        } else {
            System.out.println("数据正确");
        }
    }
}

class TestDemo02 {
    public static void main(String args[]) {

        yichu yc = new yichu();
        Scanner sn = new Scanner(System.in);
        double a = 0, b = 0;
        a = sn.nextDouble();
        b = sn.nextDouble();
        try {
            yc.input(a);
            yc.input(b);
        } catch (yichuException e) {
            e.printStackTrace();
        }

        try {
            yc.add(a, b);
        } catch (yichuException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
        int tmp1 = 10;
        int tmp2 = 2;
        System.out.println(tmp1 + tmp2);
    }
    //第二次提交
}
