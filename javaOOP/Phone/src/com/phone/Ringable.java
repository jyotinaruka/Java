package com.phone;

public interface Ringable {
	public default String ring() {
		return "Tring Tring Tring!";
	}

	public default String unlock() {
		return "Phone unlocked!";
	}

}
