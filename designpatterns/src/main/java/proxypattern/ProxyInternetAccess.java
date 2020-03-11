package proxypattern;

public class ProxyInternetAccess implements CollegeInternetAccess
{
	 private String studentName;  
     private RealInternetAccess  realaccess;  
         public ProxyInternetAccess(String studenName) {  
      this.studentName = studentName;  
  }  
  @Override  
  public void grantInternetAccess()   
  {  
  
          realaccess = new RealInternetAccess(studentName);  
          realaccess.grantInternetAccess();  
      
  }  

}
