package demo;
import java.io.Serializable;
import javax.persistence.*;
/**
 * Created by hujinliang on 2015/9/17.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    public int id;
    @Column(nullable = false)
    public String Name;
    @Column(nullable = false)
    public int Age;

    protected User() {
    }
    public User(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
}
