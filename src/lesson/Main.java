package lesson;

import java.util.HashSet;
import java.util.Set;

public class Main {

    Set users = new HashSet();

    public static void main(String[] args) {

//        lesson.User user1 = new lesson.User("Ali", "test@gmail.com", 24, "Baki", "0503106853");
//        lesson.User user2 = new lesson.User("Veli", "test@gmail.com", 24, "Baki", "0503106853");
//        lesson.User user3 = new lesson.User("Yusif", "test@gmail.com", 24, "Baki", "0503106853");
//        lesson.User user4 = new lesson.User("Yusif", "test@gmail.com", 23, "Baki", "0503106853");
//
//        user1.equals(user2);

//        lesson.Main main = new lesson.Main();
//        main.users(user1);
//        main.users(user2);
//        main.users(user3);
//        main.users(user4);
//
//        main.users.forEach(System.out::println);

//        main.checkUserContains(user4);

    }


    public void users(User user) {
        users.add(user);

    }


    public boolean checkUserContains(User user) {
        return users.contains(user);
    }
}
