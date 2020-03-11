package templatepattern;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TemplatePatternDemo 
{
	private static final Logger logger=LogManager.getLogger(TemplatePatternDemo.class);
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        
        Game cricket=new Cricket();
        cricket.play();  
        Game football=new Football();
        football.play();
        logger.info("----Template pattern implemented successfully----");
        
      }  

}
