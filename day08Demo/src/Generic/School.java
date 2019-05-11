package Generic;

public class School<T> {
    private T student;

    public School(T student){
        this.student = student;
    }

    public T getStudent() {
        return student;
    }

    public void setStudent(T student) {
        this.student = student;
    }
}
