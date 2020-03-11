package prototypedesignpattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import factorymethodpattern.GenerateBill;
public class EmployeeRecord implements Prototype{ 
	private static final Logger logger=LogManager.getLogger(EmployeeRecord.class);
    
	   private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	      
	   public EmployeeRecord(){  
	            logger.info("   Employee Records of KL University");  
	            logger.info("---------------------------------------------");  
	            logger.info("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
	      
	}  
	  
	 public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
		  logger.info(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
	   }  
	  
	    @Override  
	    public Prototype getClone() {  
	          
	        return new EmployeeRecord(id,name,designation,salary,address);  
	    }  
}
