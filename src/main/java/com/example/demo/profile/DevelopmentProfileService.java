package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile(value = "dev")
public class DevelopmentProfileService implements MyService {

	@Override
	public String getMessage() {
		return "Development Profile Message";
	}
}
