package greeting;

import hello.HelloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"greeting", "hello"})
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		System.out.println(context.getEnvironment().getProperty("local.server.port"));

		HelloConfig helloConfig = context.getBean(HelloConfig.class);
		System.out.println(helloConfig.getPort());

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
