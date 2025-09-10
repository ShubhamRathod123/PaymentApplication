package com.app;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuickfundsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickfundsApplication.class, args);
        System.out.println("hello world");
	}
    @Bean
    public ModelMapper mapper() {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
                .setPropertyCondition(Conditions.isNotNull());
        return modelMapper;
    }

}
