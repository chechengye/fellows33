import java.io.IOException;

/**
 * 输入一个字符，判断是大写字母还是小写字母，输出提示信息
 */
public class Test_08 {

    public static void main(String[] args)  {
        try{
            char c = (char)System.in.read();
            if(c > 'a' && c < 'z'){
                System.out.println("小写字母");
            }else if(c > 'A' && c < 'Z'){
                System.out.println("大写字母");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
