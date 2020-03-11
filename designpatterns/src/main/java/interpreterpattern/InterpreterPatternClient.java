package interpreterpattern;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterpreterPatternClient
{
	private final static Logger logger=LogManager.getLogger(InterpreterPatternClient.class);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		logger.info("Enter the String to Reverse:");
		String str=sc.next();
		StringReverse s=new StringReverse();
		logger.info("reverse of string is:");
		try {
			logger.debug(s.conversion(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			logger.info("----interpreter Design Pattern implemented----");
		}
	}

}