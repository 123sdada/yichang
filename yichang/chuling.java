package yichang;

public class chuling  extends Exception{
}
class MyMath {
    static int a;		//�˴�������static���Σ���������������private���Σ� ˽�У�;
    static int b;
    static int result=0;
    public MyMath(int a,int b) {
        MyMath.a=a;			//������ this.a=a;
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
        } catch (ArithmeticException e) {  //�������쳣����������ʱ���׳����쳣�����磬һ������"������"ʱ���׳������һ��ʵ��
            System.out.println("�������г�������������Ϊ�㣡");
            System.exit(1) ;			// �����˳�
        }
    }
}

