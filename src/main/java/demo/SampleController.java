package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping(value = "/",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<User> home() {
        return userServiceImpl.GetAllUser();
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    List<User> home(@RequestBody User user) {
        userServiceImpl.saveUser(user);
        myLogger.Log("save user");
        return userServiceImpl.GetAllUser();
    }
    @Autowired
    //@Qualifier("MyLoggerP2")
    private  MyLogger myLogger;
    @Autowired
    private UserService userServiceImpl;
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfig.class, args);

    }
}