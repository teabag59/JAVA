package dao;
import  domain.*;
public interface IUserDao {
    public abstract User  AddUser();
    public abstract boolean  UserLogin();
    public abstract boolean UpdateUser();
}
