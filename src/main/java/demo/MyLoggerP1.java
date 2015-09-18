package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by hujinliang on 2015/9/18.
 */
//@Component
//@Qualifier("MyLoggerP1")
public class MyLoggerP1 implements MyLogger {
    private final String thename;
    public MyLoggerP1(String thename){
        this.thename = thename;
    }

    @Override
    public void Log(String str) {
        System.out.println("p1---"+str);

    }
}
