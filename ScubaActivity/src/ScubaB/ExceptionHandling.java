package ScubaB;

public class ExceptionHandling {  
	  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; 
        }      
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("error has been occured but it has been handling and the rest are proceeded");  
    }  
      
} 
