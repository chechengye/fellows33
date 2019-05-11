package weichuang.dao;

import weichuang.exception.MyException;
import weichuang.pojo.UserBean;

public class UserDaoImp implements UserDao{
    @Override
    public void login(UserBean u) throws MyException{

        if("admin".equals(u.getUserName()) && "1234".equals(u.getPwd())){
            System.out.println("登陆成功！");
        }else{
            MyException myException = new MyException("用户名或密码错误！");
            throw myException;

        }
    }
}
