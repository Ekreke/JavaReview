/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/04/19:21
 * @Description:
 */
public class Static {
    // 静态变量
    public static int staticVar = 0;
    // 常量
    public static final int constantVar = 1;

    public void f1(){

    }
    public void f(int a){
        System.out.println(a);
    }

    public int f4(int a , int b){
        return a + b;
    }

    public int f3(){
        int x = 1;
        return x;
    }

    // private function
    private  void  f5(){
        System.out.println("this is a private function!!!");
    }


    public static  void StaticFunction (){
        System.out.println("this is a static function!!!");
    }
}

