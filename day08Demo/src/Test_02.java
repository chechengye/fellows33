import com.weichuang.Dog;
import com.weichuang.bean.UserBean;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Test_02 {

    public static void main(String[] args) {

        UserBean userBean = new UserBean();

        try {
            BeanUtils.setProperty(userBean , "username" , "admin");
            System.out.println(userBean);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
