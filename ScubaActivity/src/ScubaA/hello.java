package ScubaA;

import java.util.*; 

public class hello{  
 public static void main(String args[]){  
  ArrayList<String> Cricketers=new ArrayList<String>(); 
  Cricketers.add("MSD");   
  Cricketers.add("Yuvraj");    
  Cricketers.add("Sachin");    
  Cricketers.add("AB De Villiers"); 
  Cricketers.add("Kohli");
   
  Iterator itr=Cricketers.iterator();
  while(itr.hasNext()){ 
   System.out.println(itr.next());
  }  
 }  
 
}  