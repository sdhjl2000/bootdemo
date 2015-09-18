package demo;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.stereotype.*;

import java.util.List;
@org.springframework.stereotype.Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT user FROM User user")
    public List<User> findAll();
}
