package com.ex;

import java.util.*;

public class I18Main {

	static public void main(String[] args) {

		String language = "en";
		String country = "us";

		if (args.length != 2) {
			language = new String("en");
			country = new String("US");
		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}

		Locale currentLocale = new Locale(language, country);
		ResourceBundle messages = ResourceBundle.getBundle("resources/Bundle", currentLocale);

		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));

		System.out.println("happy birthday");
	}
}