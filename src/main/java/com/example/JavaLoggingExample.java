package com.example;

import java.util.logging.Logger;

public class JavaLoggingExample {

	static Logger log = Logger.getLogger(JavaLoggingExample.class.getName());

	public static void main(String[] args) {

		System.out.println("Hello Sysout logging....");

		log.warning("Hello JAVA 내장로그로 출력....");
//		log.info(msg);
	}

}
