package proxypattern;

public class ProxyPatternClient{
	 public static void main(String[] args)   
	    {  
	        CollegeInternetAccess access = new ProxyInternetAccess("vinakumar");  
	        access.grantInternetAccess();  
	    }

}
