package com;

import org.modelmapper.ModelMapper;
import org.modelmapper.jackson.JsonNodeValueReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BloodDonorManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorManagementSystemApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		modelMapper.getConfiguration().addValueReader(new JsonNodeValueReader());
		modelMapper.getConfiguration().setSkipNullEnabled(true);
		return modelMapper;
	}
}
