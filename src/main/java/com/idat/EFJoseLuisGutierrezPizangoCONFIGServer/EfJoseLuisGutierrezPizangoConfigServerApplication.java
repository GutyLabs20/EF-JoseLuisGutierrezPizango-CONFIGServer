package com.idat.EFJoseLuisGutierrezPizangoCONFIGServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfJoseLuisGutierrezPizangoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJoseLuisGutierrezPizangoConfigServerApplication.class, args);
	}

}
