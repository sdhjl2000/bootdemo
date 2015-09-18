package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hujinliang on 2015/9/17.
 */
@Service
@Aspect
public final class UserServiceImpl implements UserService {
    @Autowired
   public final UserRepository ur;

    @Autowired
    public UserServiceImpl(UserRepository ur) {
        this.ur = ur;
    }
    public String getUserName() {
        return "from impl";
        
    }
    public User saveUser(User user) {
        ur.save(user);
        return user;
    }


    public List<User> GetAllUser() {
       return ur.findAll();
    }

    @Pointcut("execution(* UserServiceImpl.getUserName(..))")
    public void plunderPC() {}
    @Before("plunderPC()")
    public void singYoHo() {
       System.console().printf("singyoho");
    }
    @After("plunderPC()")
    public void singYoHoA() {
        System.console().printf("singyohoA");
    }
}
