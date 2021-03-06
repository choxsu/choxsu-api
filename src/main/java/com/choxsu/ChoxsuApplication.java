package com.choxsu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author choxsu
 * @date 2019/7/1
 */
@SpringBootApplication
public class ChoxsuApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ChoxsuApplication.class);
        // off banner mode
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

    }
}
