package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by hujinliang on 2015/9/18.
 */
//@Component
//@Primary
//@Qualifier("MyLoggerP2")
public class MyLoggerP2 implements MyLogger {
    @Override
    public void Log(String str) {
        System.out.println("p2---"+str);
    }
}
