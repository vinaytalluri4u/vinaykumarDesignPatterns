package prototypedesignpattern;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import factorymethodpattern.GenerateBill;  
  
public class PrototypeDemo{ 
	private static final Logger logger=LogManager.getLogger(PrototypeDemo.class);
     public static void main(String[] args) throws IOException 
     {  
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        logger.info("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
          
        logger.info("Enter Employee Name: ");  
        String ename=br.readLine();  
         
          
        logger.info("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
          
          
        logger.info("Enter Employee Address: ");  
        String eaddress=br.readLine();  
         
          
        logger.info("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());   
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();   
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
        logger.info("----Prototype design pattern implemented successfully----");
    }     
}