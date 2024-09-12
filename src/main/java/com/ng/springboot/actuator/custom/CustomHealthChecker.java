package com.ng.springboot.actuator.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component // http://localhost:8080/admin/health/customHealthChecker
public class CustomHealthChecker implements HealthIndicator {

	private final String ID = "My Custom Health Checker";

	@Override
	public Health health() {

		if (checkHealth()) {

			return Health.up().withDetail(ID, "All Running Fine").build();
		}

		return Health.down().withDetail(ID, "Something Went Wrong").build();
	}

	private boolean checkHealth() {

		// Write all required logic here;

		// below line will give random true / false based on current milisec is odd or
		// even
		return (System.currentTimeMillis() & 1) == 1;
	}

}
