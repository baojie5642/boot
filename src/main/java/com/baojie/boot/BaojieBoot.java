package com.baojie.boot;

import com.baojie.boot.config.PictureUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({PictureUploadProperties.class})
public class BaojieBoot {

    public static void main(String[] args) {
        SpringApplication.run(BaojieBoot.class, args);
    }

}
