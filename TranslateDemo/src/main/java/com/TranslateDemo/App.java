package com.TranslateDemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class App {
	public static void main(String[] args) {
		String language = "ge";
		String country = "GE";
		Locale currentLocale = new Locale(language, country);
		ResourceBundle messages = ResourceBundle.getBundle("Bundle", currentLocale);
		

		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}
}
