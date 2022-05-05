package csc319.example.videospringdemo;

import csc319.example.videospringdemo.Controller.Video;
import csc319.example.videospringdemo.Controller.repository.VideoModel;
import csc319.example.videospringdemo.Controller.repository.VideoRepository;
import jdk.jfr.Enabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collection;

@SuppressWarnings("All")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
@Configuration
public class VideoSpringDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(VideoSpringDemoApplication.class, args);
    }
    @Bean
    public VideoRepository videoRepository(){
        return new VideoModel();
    }

}
