package com.tallate.test;


import com.tallate.tidp.spring.DebugConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author hgc
 * @date 4/5/19
 */
@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = {"com.tallate.test.controller",
    "com.tallate.test.commonconfig",
    "com.tallate.test.mysqlconfig"})
@PropertySource({"classpath:properties/mysql.properties"})
public class TestMySQLIdpApplication {

  public static void main(String[] args) {
    DebugConfig.toggleDebugMode();
    SpringApplication.run(TestMySQLIdpApplication.class, args);
  }

}
