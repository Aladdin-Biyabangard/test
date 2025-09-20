package lesson;

import java.util.UUID;

public class User {

    private String id;

    private String name;

    private int age;

    public User() {

    }

    public User(String name, int age) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
