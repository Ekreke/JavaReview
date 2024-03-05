/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/03/14:53
 * @Description:
 */
public class FloatingNumberLostPrecision {
    public static void main(String[] args) {
        float a = 2.0f - 1.9f;
        float b = 1.8f - 1.7f;
        System.out.println(a) ;
        System.out.println(b);
        System.out.println(a == b);
    }
}
