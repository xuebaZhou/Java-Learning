package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//   实现Comparable接口，比较对象的顺序
class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    //    Comparable接口中只有一个方法
//    public int compareTo(Person o) {
//        return Integer.compare(this.id, o.id);
//    }

//    按照年龄升序排序
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}

public class main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30, 46688));
        personList.add(new Person("Bob", 25, 29936));
        personList.add(new Person("Charlie", 35, 36936));
        Collections.sort(personList);
        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getAge() + " - " + person.getId());
        }
    }
}
