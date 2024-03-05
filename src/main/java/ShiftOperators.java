/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/03/13:10
 * @Description:
 */
public class ShiftOperators {
    public static void main(String[] args) {
        int i = -1 ;
        System.out.println("init data" + i);
        System.out.println("binary data" + Integer.toBinaryString(i) );
        i <<=  10 ;
        System.out.println("left shift data" + i);
        System.out.println("let shift binary data" + Integer.toBinaryString(i));
        
    }
}
