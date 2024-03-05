package Generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/05/16:49
 * @Description:
 */
public class GenericsFunction {
    public static <E> void printArray(E[]inputArray){
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // 创建不同类型数组：Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray  );

    }
}
