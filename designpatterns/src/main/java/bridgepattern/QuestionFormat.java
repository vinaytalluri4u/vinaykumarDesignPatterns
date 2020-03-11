package bridgepattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class QuestionFormat extends QuestionManager {  
	private static final Logger logger=LogManager.getLogger(QuestionFormat.class);
    public QuestionFormat(String catalog){  
        super(catalog);  
    }  
    public void displayAll() {  
        logger.info("---------------------------------------------------------");  
        super.displayAll();  
        logger.info("-----------------------------------------------------------");  
        logger.info("----bridge pattern implemented successfully----");

    }  
    
}
