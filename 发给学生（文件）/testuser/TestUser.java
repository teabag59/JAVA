package testuser;
import dao.UserDaoImpl;
import domain.User;
import java.util.*;
public class TestUser {
  public  static void main(String[] args)
  {
      Scanner  sc=new Scanner(System.in);
      UserDaoImpl userdaoimpl=new  UserDaoImpl();
      List list=new ArrayList();
      do {
          User  user=userdaoimpl.AddUser();
          list.add(user);
          System.out.println("是否继续输入用户信息（Y/N:）");
      }while ("Y".equalsIgnoreCase(sc.nextLine()));
      System.out.println("----------迭代器");
      Iterator iter=list.iterator();
      while (iter.hasNext())
      {
          System.out.println(iter.next());
      }
  }
}

