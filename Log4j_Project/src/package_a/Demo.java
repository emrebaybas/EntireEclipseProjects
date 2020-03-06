package package_a;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		
		//To print something in the output
		// there are different options as info, debug, error, fatal
		
		log.debug("Debug will not be printed until you configure log4j to print them");
		log.fatal("Fatal mistake");
		log.info("Info will not be printed until you configure log4j to print them");
		log.error("test failed for some reason");	
	}
}
