package co.in.hibernateproj.newhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages="co.in.hibernateproj.newhibernate.repo")
@ComponentScan({"co.in.hibernateproj.newhibernate"})
public class MyHibernateBoot 
{
    public static void main( String[] args ){
       SpringApplication.run(MyHibernateBoot.class, args);
    }
}
