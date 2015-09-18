package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by hujinliang on 2015/9/18.
 */
@Configuration
@ComponentScan(basePackageClasses={UserService.class})
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Autowired
    Environment env;

    @Bean(name="myloger")
    @Primary
    public MyLogger myloger() {
       String str = env.getProperty("disc.artist");
        return new MyLoggerP1(str);
    }
}
