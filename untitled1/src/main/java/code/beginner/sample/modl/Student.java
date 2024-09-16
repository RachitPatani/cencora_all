package  code.beginner.sample.modl;

public class Student {
    private int rollno;
    private String name;
    private String course;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", course='" + course + '\'' +
                '}';
    }
}
