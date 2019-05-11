package weichuang.service;

import weichuang.dao.UserDaoImp;
import weichuang.pojo.UserBean;

import java.util.Scanner;

public class UserService {

    public static void main(String[] args) {
        UserDaoImp userDaoImp = new UserDaoImp();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        UserBean u = new UserBean();
        u.setUserName(userName);
        System.out.println("请输入密码:");
        String pwd = sc.next();
        u.setPwd(pwd);
        userDaoImp.login(u);

    }

}
