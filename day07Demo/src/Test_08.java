import java.util.ArrayList;
import java.util.List;

public class Test_08 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zs" , 11));
        list.add(new Student("ls" , 13));
        list.add(new Student("ww" , 40));
        Teacher t = new Teacher();
        t.setStudents(list);
        t.setName("王老师");
        t.setAge(34);
        System.out.println(t);

    }
}

class Student{
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
class Teacher{
    private String name;
    private int no;
    private int age;
    private List<Student> students;

    public Teacher(){

    }
    public Teacher(String name, int no, int age) {
        this.name = name;
        this.no = no;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", age=" + age +
                ", students=" + students +
                '}';
    }
}