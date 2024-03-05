/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/04/21:14
 * @Description:
 */
public class OverLoadPriority {
    public static void printVariable(String ...args){
        for (String i : args) {
            System.out.println(i);
        }
    }


    public static void printVariable(String arg1 , String arg2){
        System.out.println(arg1 + arg2);
    }

    public static void main(String[] args) {
        printVariable("a", "b");
        printVariable("a", "b","c");
    }
}

