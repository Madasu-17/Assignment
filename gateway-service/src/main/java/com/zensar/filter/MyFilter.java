package com.zensar.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		System.out.println("PreProcessing of request "+exchange.getRequest());
		
		//return chain.filter(exchange);  ----  ///Preprocessing
		
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			System.out.println("PostProcessing "+ exchange.getResponse());
		}));
		
	}

}
