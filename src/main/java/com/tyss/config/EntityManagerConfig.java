package com.tyss.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.grocerybean.EntityManagerSample;

@Configuration
public class EntityManagerConfig {
	

	    @Bean
		public EntityManagerSample getEntityManagerDemo() {
	    	EntityManagerSample entityManagerSample= new EntityManagerSample();
	    	entityManagerSample.setEntityManager(Persistence.createEntityManagerFactory("grocery").createEntityManager());;
			return entityManagerSample;
		}
}
