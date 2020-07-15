package com.inception.awslambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwslambdaApplication {

  public static void main(String[] args) {
    SpringApplication.run(AwslambdaApplication.class, args);
  }

  @Bean
  public Function<String, String> function(){
    return input -> input.toUpperCase();
  }

  @Bean
  public Consumer<String> consume(){
    return x -> {
      System.out.printf("input is :: " + x);
    };
  }

  @Bean
  public Supplier<String> supply() {
    return ()  -> "Hello there";
  }

}
