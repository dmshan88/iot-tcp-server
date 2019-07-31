package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.jnrsmcu.sdk.netdevice.RSServer;



@Configuration
public class BeanConfiguation {
	
	@Value("${app.tcp_port}")
	private int port;
	
	@Bean
	public RSServer RSServer() {
		return RSServer.Initiate(port);
	}
	
}
