package yichang;

public class chuling  extends Exception{
}
class MyMath {
    static int a;		//此处必须用static修饰（公开），不能用private修饰（ 私有）;
    static int b;
    static int result=0;
    public MyMath(int a,int b) {
        MyMath.a=a;			//可以用 this.a=a;
        MyMath.b=b;
    }
    public void MyMath() {
        result=a/b;
        System.out.println(result);
    }
}


class TestDemo {
    public static void main(String args[]) {
        MyMath m=new MyMath(1,0);
        try {
            m.MyMath();
        } catch (ArithmeticException e) {  //当出现异常的运算条件时，抛出此异常。例如，一个整数"除以零"时，抛出此类的一个实例
            System.out.println("程序运行出错，被除数不能为零！");
            System.exit(1) ;			// 程序退出
        }
    }
}

