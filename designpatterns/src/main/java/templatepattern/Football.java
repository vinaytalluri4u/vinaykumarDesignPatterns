package templatepattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import interpreterpattern.InterpreterPatternClient;

public class Football extends Game {
	private final static Logger logger=LogManager.getLogger(Football.class);
	@Override
	
	void initialize() {
		logger.info("Football game initialised start playing");
		
	}

	@Override
	void start() {
		logger.info("game started welcome to football");
		
	}

	@Override
	void end() {
		logger.info("Football game ended");
		
	}

}
