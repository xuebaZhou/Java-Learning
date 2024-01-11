package xuesheng;

class Grade {
    private String studentName;
    private String courseName;
    private double score;

    public Grade(String studentName, String courseName, double score) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getScore() {
        return score;
    }
}
