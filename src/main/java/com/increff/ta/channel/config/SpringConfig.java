package com.increff.ta.channel.config;

import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.increff.ta.channel")
@PropertySources({ //
    @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = false) //
})
public class SpringConfig {

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}