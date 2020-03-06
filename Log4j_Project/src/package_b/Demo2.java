package package_b;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
	
	private static Logger log=LogManager.getLogger(Demo2.class.getName());
	
	public static void main(String[] args) {
		
		//To print something in the output
		// there are different options as info, debug, error, fatal
		
		log.debug("Yes");
		log.fatal("No");
		log.info("May be");
		log.error("Definitely Not");	
	}
}
