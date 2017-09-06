package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName()); 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log2.log(Level.INFO, "JAVA Standard Logger");
		
		
		log.trace("commons 1. TRACE level log");
		log.debug("commons 2. DEBUG level log"); //필터링 하기 위해서 레벨을 지정한다.
		log.info( "commons 3. INFO level log");
		log.warn( "commons 4. WARN level log");
		log.error("commons 5. ERROR level log");
		log.fatal("commons 6. FATAL level log");
		
		log.info("######################");
		
		
	}

}
