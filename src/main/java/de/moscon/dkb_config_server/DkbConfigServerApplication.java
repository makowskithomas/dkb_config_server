package de.moscon.dkb_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
   Check/See configuration with:

    http://localhost:8888/application/default

 */

@SpringBootApplication
@EnableConfigServer
public class DkbConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DkbConfigServerApplication.class, args);
	}

}
