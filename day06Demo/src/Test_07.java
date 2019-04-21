import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Test_07 {

    public static void main(String[] args) {
        String psd = "admDSDSin+123/456"; //pmq7VoTEWWLYh1ZPCDRujQ==
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] bytes = psd.getBytes("utf-8");
            byte[] bytes1 = md.digest(bytes);

            //a-z A-Z 0-9 / +
            String str = Base64.getEncoder().encodeToString(bytes1);
            System.out.println(str);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
