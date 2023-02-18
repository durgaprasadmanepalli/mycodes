package com.axis.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.axis.repository")
public class Mongoconfig {

}
