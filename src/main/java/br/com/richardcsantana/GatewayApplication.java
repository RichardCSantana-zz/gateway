package br.com.richardcsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class GatewayApplication {

    public static void main(final String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
