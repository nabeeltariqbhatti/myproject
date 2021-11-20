package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;


@RestController

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MyprojectApplication implements  ExitCodeGenerator  {

    @GetMapping("/")
    public String defaultChecker(){

        return "hello world";
    }

    @Override
    public int getExitCode() {
        return 89;
    }

    //exit code
//    @Bean
//    public ExitCodeGenerator exitCodeGenerator(){}

    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");
//        System.setProperty("logging.level.root","DEBUG");

//        SpringApplication.run(MyprojectApplication.class, args);
//
//
//        System.setProperty("spring.application.admin.enabled", "true");

//
//        System.exit(23);
        SpringApplication application = new SpringApplication(MyprojectApplication.class);
        application.setBannerMode(Banner.Mode.OFF);

        application.run(args);
        application.setAddCommandLineProperties(false);








    }


}
