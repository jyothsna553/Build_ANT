package testANT;

import java.util.Date;

public class AntClass {

	public static void main(String[] args){									       
		System.out.println("HELLO GURU99 ANT PROGRAM");					        
		System.out.println("TODAY's DATE IS->"+ currentDate() );					  
}		    		   
public static String currentDate(){					        
	return new Date().toString();					  
	}		
}
