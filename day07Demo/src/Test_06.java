import java.util.Optional;

public class Test_06 {

    public static void main(String[] args) {
        Cat cat = new Cat(1 ,"ceshi");
        Optional optional = Optional.ofNullable(cat);
        System.out.println(optional.orElse(optional));

    }
}
