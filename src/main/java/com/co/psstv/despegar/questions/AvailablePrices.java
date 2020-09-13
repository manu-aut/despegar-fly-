package com.co.psstv.despegar.questions;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

//serenityCore

public enum AvailablePrices {
	Available(TRUE), Unavailable(FALSE);

	private final Boolean isAvailable;

	AvailablePrices(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public static AvailablePrices from(Boolean visibility) {
		for (AvailablePrices itemAvailability : values()) {
			if (visibility == itemAvailability.isAvailable) {
				return itemAvailability;
			}
		}
		throw new IllegalArgumentException("Unknown value " + visibility);
	}
}