package demo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hujinliang on 2015/9/18.
 */
@Service
public interface UserService {
    User saveUser(User user);
    List<User> GetAllUser();
}

