package xuesheng;
class Student {
    private String name;
    private int id;
    private String gender;
    private String className;

    public Student(String name, int id, String gender, String className) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getClassName() {
        return className;
    }
}





