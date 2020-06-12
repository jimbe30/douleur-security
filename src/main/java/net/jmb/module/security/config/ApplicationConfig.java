package net.jmb.module.security.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.jmb.module.security.model.mapper.RoleMapperFactory;

@Configuration
@EnableCaching
public class RequestContextConfig {	
	
	@Bean
	RoleMapperFactory roleMapperFactory() {
		return new RoleMapperFactory();
	}


}
