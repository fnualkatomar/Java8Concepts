package com.java8.date;

import java.time.Instant;
import java.util.Date;

public class BridgeWithLegacy {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		Date legacyDate = Date.from(instant);
		System.out.println(legacyDate);
		System.out.println(instant);
	}

}
