package proxypattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class RealInternetAccess implements CollegeInternetAccess
{
	private static final Logger logger=LogManager.getLogger(RealInternetAccess.class);
	private String studentName;  
    public RealInternetAccess(String stuName) {  
        this.studentName = stuName;  
    }  
    @Override  
    public void grantInternetAccess() {  
        logger.info("Internet Access granted for student");
        logger.info("----proxypattern implemented successfully----");
    }  
    

}
