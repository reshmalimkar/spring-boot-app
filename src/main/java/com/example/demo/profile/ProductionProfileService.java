package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile(value = "prod")
public class ProductionProfileService implements MyService {
	@Override
	public String getMessage() {
		return "Production Profile Message";
	}
}
