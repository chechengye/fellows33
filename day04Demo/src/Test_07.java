/**
 * 模板方法模式（Templete Method）
 */
public class Test_07 {
    public static void main(String[] args) {
        BaseMange bm = new UserMange();
        bm.action("admin" , "get");
        BaseMange bm1 = new StudentMange();
        bm1.action("teacher" , "查看学号");
    }
}

abstract class BaseMange{

    public void action(String userName , String method){
        if("admin".equals(userName)){
            execute(method);
        }else{
            System.out.println("没有权限！");
        }
    }
    abstract void execute(String method);
}
class UserMange extends BaseMange{
    @Override
    void execute(String method) {
        if("add".equals(method)){
            System.out.println("增加用户操作");
        }else if("get".equals(method)){
            System.out.println("查询用户操作");
        }
    }
}
class StudentMange extends BaseMange{

    @Override
    void execute(String method) {

    }
}
