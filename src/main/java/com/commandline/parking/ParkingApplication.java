package com.commandline.parking;

import com.commandline.parking.client.CarClient;
import com.commandline.parking.client.ParkingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class ParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}
	@Bean
	CarClient getCarClient(){
		WebClient client = WebClient.builder()
				.baseUrl("http://localhost:8080")
				.defaultHeader("Accept","application/json")
				.build();
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
		return factory.createClient(CarClient.class);
	}

	@Bean
	ParkingClient getParkingClient(){
		WebClient client = WebClient.builder()
				.baseUrl("http://localhost:8080")
				.defaultHeader("Accept","application/json")
				.build();
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
		return factory.createClient(ParkingClient.class);
	}

}
