package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by mmb on 2016/7/30.
 */
@EnableConfigServer
@SpringBootApplication
public class MMBConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MMBConfigServerApplication.class, args);
    }
}
