package ru.aston.gamezo_ag.task1;

public class User {

    private int age;

    private String sourName;

    private String name;

    public User(int age, String sourName, String name) {
        this.age = age;
        this.sourName = sourName;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSourName() {
        return sourName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    @Override
    public String toString() {
        return "User{" +
                ", age=" + age +
                ", sourName='" + sourName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    public static ArrayList createSomeUsers() {
//
//        ArrayList<User> users = new ArrayList<>();
//        User user = new User(0,22,"Prigozhin","Eugene");
//        users.add(user);
//        User user1 = new User(1,23,"WADHd","wadwad");
//        users.add(user1);
//        User user2 = new User(2,55,"wadawd","wadawd");
//        users.add(user2);
//        User user3 = new User(3, 56,"wdad","wadawd");
//        users.add(user3);
//        User user4 = new User(4,66,"wadd","wadawd");
//        users.add(user4);
//        return users;
//    }
}
