package springboot.example.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// start component scan and autonomic configuration

/**
 * @SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
 */
@SpringBootApplication
public class ReadinglistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadinglistApplication.class, args);
    }

}
