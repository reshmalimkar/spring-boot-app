package com.example.demo.util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Utility {
	 @Value("${random.number.length}")
	    private int randomNumberLength;

	public String randomTenDigitNumber() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < randomNumberLength; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }
}
