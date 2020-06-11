package br.com.lanhellas.springadminoauth2;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringadminOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringadminOauth2Application.class, args);
    }

}
