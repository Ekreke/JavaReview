package Generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/05/16:40
 * @Description:
 */
public class GenericsClass<T> {
    private  T key;
    public T getKey() {
        return key;
    }
    public void setKey(T key) {
        this.key = key;
    }

    public GenericsClass(T key) {
        this.key = key;
    }
}
