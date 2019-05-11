import weichuang.tools.MD5Utils;

import java.util.Scanner;

public class Test_07 {

    public static void main(String[] args) {
        String psd = "admd123456"; //pmq7VoTEWWLYh1ZPCDRujQ==

        String md5Str = "X3J0G/h4XOuS0cO2ADO3vQ==";

        Scanner sc = new Scanner(System.in);
        String str = MD5Utils.getMD5String(sc.next());

        if(md5Str.equals(str)){
            System.out.println("密码正确");
        }
        /*try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] bytes = psd.getBytes("utf-8");
            byte[] bytes1 = md.digest(bytes);

            //a-z A-Z 0-9 / +
            String str = Base64.getEncoder().encodeToString(bytes1);
            System.out.println(str);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        System.out.println(MD5Utils.getMD5String(psd));

    }
}
