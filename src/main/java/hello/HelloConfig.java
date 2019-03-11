package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class HelloConfig {
    @Autowired
    private Environment environment;

    public int getPort(){
        return Integer.parseInt(environment.getProperty("local.server.port"));
    }
}
