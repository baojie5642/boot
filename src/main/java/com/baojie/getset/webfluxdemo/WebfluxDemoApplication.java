package com.baojie.getset.webfluxdemo;

import com.baojie.getset.webfluxdemo.model.MyEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
@ComponentScan(value = "com.baojie.getset.webfluxdemo")
public class WebfluxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(MongoOperations mongo) {
        return (String... args) -> {
            mongo.dropCollection(MyEvent.class);
            mongo.createCollection(MyEvent.class, CollectionOptions.empty().maxDocuments(200).size(100000).capped());
        };
    }
}
