package templatepattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cricket extends Game
{
	public static final Logger logger=LogManager.getLogger(Cricket.class);

	@Override
	void initialize() {
		logger.info("Cricket game initialised start playing");
		
	}

	@Override
	void start() {
		logger.info("game started welcome to cricket");
		
		
	}

	@Override
	void end() {
		logger.info("Cricket game ended");
		
	}

}
