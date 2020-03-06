package package_b;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String[] args) {
		
		//To print something in the output
		// there are different options as info, debug, error, fatal
		
		log.debug("hello");
		log.fatal("Selam");
		log.info("Merhaba");
		log.error("Nasilsin");	
	}
}
