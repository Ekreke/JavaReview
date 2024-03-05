/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/03/14:11
 * @Description:
 */
public class WrapperClassesBuffer {
    public static void main(String[] args) {
        Integer i = 100;
        Integer b = 100;
        System.out.println(i== b);
        System.out.println(i.equals(b));
        Float f = 100.0f;
        Float g = 90.0f;
        System.out.println(f==g);
        System.out.println("equals");
        System.out.println(f.equals(g));
        System.out.println("compare to");
        System.out.println(f.compareTo(g));
        Double i3 = 1.0;
        Double i4 = 1.0;
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));
    }
}
