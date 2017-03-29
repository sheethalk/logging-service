package com.accenture.ai.fp;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;

@Configuration
@Profile("cloud")
public class CloudConfig extends AbstractCloudConfig {
  @Bean
  public MongoDbFactory documentMongoDbFactory() {
      return connectionFactory().mongoDbFactory();
  }
}
