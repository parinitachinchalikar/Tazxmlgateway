package com.connector.xmlgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("com.connector.xmlgateway.entity.*")
@ComponentScan(basePackages = { "com.connector.xmlgateway.*" })
public class XmlgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlgatewayApplication.class, args);
	}
}