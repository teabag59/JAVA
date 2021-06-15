package dao;
import java.util.Scanner;
import domain.*;
public class UserDaoImpl implements  IUserDao {
    private static final String USERNAME = "Tom";//此处定义用户名
    private static final String PASSWORD = "123";//定义密码

    @Override
    public User AddUser() {
      /*  String  username;
        String  password;
        String   birthday;*/
        User user=new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        user.username= sc.nextLine();
        System.out.println("请输入您的密码:");
        user.password = sc.nextLine();
        System.out.println("确认输入你的生日:");
        user.birthday = sc.nextLine();
        return user;
    }

    @Override
    public boolean UserLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        String username_in = sc.nextLine();
        System.out.println("请输入您的密码:");
        String password_in = sc.next();
        if (USERNAME.equals(username_in) && PASSWORD.equals(password_in)) {
            System.out.println("登录成功");
            return true;
        } else {
            System.out.println("用户名或密码错误");
            return false;
        }

    }

    @Override
    public boolean UpdateUser()
    {
        System.out.println("修改密码");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入原密码:");
        String oldpassword = sc.nextLine();
        if (PASSWORD.equals(oldpassword))
        {
            System.out.println("输入新密码:");
            String newpassword = sc.nextLine();
            if ("".equals(newpassword))
                return false;
            else
                return true;
        }
        else
            return false;

    }
}


