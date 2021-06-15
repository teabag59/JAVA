package domain;
import java.util.Date;
public class User {

    public String  username;
    public String  password;
    public  String   birthday;
    //Date birthday; //如果采用日期型 ，就需要注意格式的转换
    public User() {
    }

    public User(String username, String password, String passwordConfirm, String birthday) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
