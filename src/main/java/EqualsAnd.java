import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/03/05/13:44
 * @Description:
 */
public class EqualsAnd {
    public static void main(String[] args) {
        User user1 = new User("name",11);
        User user2 = new User("name",11);
        User user3 = user1;
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
        System.out.println(user1.hashCode() == user2.hashCode());
        System.out.println(user1.equals(user3));
        System.out.println(user1 == user3);
        System.out.println(user1.hashCode() == user3.hashCode());
        user3.age = 12 ;
        System.out.println(user1.age);
    }

    static class User {
        String name;
        int age ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return getAge() == user.getAge() && getName().equals(user.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }
    }
}
