package com.resonance.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Environment {
	/*
	 * This method returns the app url present in environment.properties file
	 */

	public void getAppUrl() throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");
		System.out.println("BaseDIR:" + baseDir);
		FileInputStream fis = new FileInputStream("");
		Properties property = new Properties();

	}

	public static void main(String[] args) throws FileNotFoundException {
    new Environment().getAppUrl();
	}
}
