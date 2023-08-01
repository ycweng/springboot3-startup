package tw.ycw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tw.ycw")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
