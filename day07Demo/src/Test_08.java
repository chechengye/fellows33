import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_08 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("zs" , 11);
        Student s2 =new Student("ls" , 13);
        list.add(s1);
        list.add(new Student("ls" , 13));
        list.add(new Student("ww" , 40));
        Teacher t = new Teacher();
        t.setStudents(list);
        t.setName("王老师");
        t.setAge(34);
        System.out.println(t);
        List<Curse> curseList = new ArrayList<>();
        curseList.add(new Curse("语文"));
        curseList.add(new Curse("数学"));
        curseList.add(new Curse("英语"));
        s1.setCurseList(curseList);
        System.out.println(s1);
        Curse curse = new Curse("文学");
        List<Student> students = new ArrayList<>();
        Collections.addAll(students , s1 , s2);
        curse.setStudentList(students);
        System.out.println(curse);
    }
}

class Curse{
    private String name;
    private List<Student> studentList;

    public Curse(){

    }
    public Curse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Curse{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

class Student{
    private String name;
    private int no;
    private List<Curse> curseList;


    public List<Curse> getCurseList() {
        return curseList;
    }

    public void setCurseList(List<Curse> curseList) {
        this.curseList = curseList;
    }

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
                ", curseList=" + curseList +
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