package Generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/05/16:42
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> integerGenericsClass = new GenericsClass<Integer>(134567);
        System.out.println(integerGenericsClass.getKey());
    }

}
