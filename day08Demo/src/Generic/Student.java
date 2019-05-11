package Generic;

public class Student<T> {
    private T core;

    public Student(T core){
        this.core = core;
    }

    public T getCore() {
        return core;
    }

    public void setCore(T core) {
        this.core = core;
    }
}
