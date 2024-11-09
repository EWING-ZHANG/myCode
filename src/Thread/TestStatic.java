package Thread;

import java.util.Map;

public class TestStatic {
    public static void main(String[] args) {
        User user = new User();
        boolean ewing = user.register("ewing", "520");
        System.out.println(ewing);
        boolean login = user.login("ewing", "520");
        System.out.println(login);

    }

}
