package xuesheng;

class Course {
    private int courseNumber;
    private String courseName;
    private int credit;

    public Course(int courseNumber, String courseName, int credit) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.credit = credit;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }
}





