/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/04/21:03
 * @Description:
 */
public class OverRideOverLoad {
    public String name(){
        return "superhero";
    }
}


// that is override
class  SuperMan  extends  OverRideOverLoad{
    @Override
    public String name() {
        return "superman";
    }

    public static void main(String[] args) {
        SuperMan s = new SuperMan();
        System.out.println(s.name());
    }
}

class  OverLoad{
    public String isFunc1(int a){
        return "It is func1";
    }

    public String isFunc1(int ...args){
        return "it is func alternative";
    }
}

