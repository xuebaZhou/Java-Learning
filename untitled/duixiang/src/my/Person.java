package my;

public class Person {
    public String name;
    char gender;
    private int age;

    public Person() {
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
