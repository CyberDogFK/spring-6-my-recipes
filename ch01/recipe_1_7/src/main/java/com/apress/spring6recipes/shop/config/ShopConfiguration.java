package com.apress.spring6recipes.shop.config;

import com.apress.spring6recipes.shop.Cashier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ShopConfiguration {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:messages");
		messageSource.setCacheSeconds(1);
		return messageSource;
	}

	@Bean
	public Cashier cashier(MessageSource messageSource) {
		return new Cashier(messageSource);
	}
}
