package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersisitenceConfiguration {

    @Value("${application.url}")
    private String url;
    @Value("${application.username}")
    private String userName;
    @Value("${application.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(url);
        builder.username(userName);
        builder.password(password);
        System.out.println("My custom bean datasource has been created ");
        return builder.build();
    }


}
