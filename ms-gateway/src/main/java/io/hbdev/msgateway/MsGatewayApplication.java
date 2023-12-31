package io.hbdev.msgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGatewayApplication.class, args);
	}
	
	//->REGISTRANDO OS MS NO GATEWAY PARA SER FEITO O LOUDBALANCE
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
		return  builder
				.routes()
					.route( r -> r.path("/api/clientes/**").uri("lb://ms-clientes") )
					.route( r -> r.path("/api/cartoes/**").uri("lb://ms-cartoes") )
					.route( r -> r.path("/api/avaliacoes-credito/**").uri("lb://ms-avaliadorCredito") )
				.build();
	}


}
