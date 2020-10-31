package com.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy note9 = new Galaxy("note9", 99, "At&T", "Ting Ting Ting Ta!");
		IPhone iPhoneX = new IPhone("X", 100, "T-Mobile", "Tring Tring Tring!");

		note9.displayInfo();
		System.out.println(note9.ring());
		System.out.println(note9.unlock());

		iPhoneX.displayInfo();
		System.out.println(iPhoneX.ring());
		System.out.println(iPhoneX.unlock());

	}

}
