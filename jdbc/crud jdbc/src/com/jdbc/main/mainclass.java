package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.model.employ;
import com.jdbc.service.databaseservice;

public class mainclass {

	public static void main(String[] args) {
	databaseservice databaseService = new databaseservice();
     try(Scanner s=new Scanner(System.in);) {
    	boolean isRunning = true; 
    	while(isRunning)
    	{
    		
    		 System.out.println("Enter choice");
             System.out.println("1.Insert");
             System.out.println("2.select all");
             System.out.println("3.select employee by id");
             System.out.println("4.delete employee");
             System.out.println("5.update employee");
             System.out.println("6.exit");
         int choice = Integer.parseInt(s.nextLine());
        
         
         
         switch(choice) 
          {
         case 1:
        	 System.out.println("enter name, address, salary");
        	 databaseService.insertEmployee(new employ(s.nextLine(), s.nextLine(), 
        			 Double.parseDouble(s.nextLine())));
            break;
        	
        	
         case 2:
        	 System.out.println(choice);
        	 databaseService.getAllEmployees();
        	 break;
        	  
         case 3:
        	 System.out.println("enter id");
        	 databaseService.getEmployeeById(Integer.parseInt(s.nextLine()));
        	 break;
        	 
         case 4:
        	 System.out.println("enter the id");
        	 databaseService.deleteEmployeeBuId(employeeById(Integer.parseInt(s.nextLine())));
        	 
        	 break;
        	 
         case 5:
        	 System.out.println("enter the id ");
        	 int updateId = Integer.parseInt(s.nextLine());
        boolean isFound = databaseService.getEmployeeById(updateId);
        	 if(isFound)
        	 {
        		 System.out.println("Enter name, address, salary");
        		 employ employee = new employ(updateId, s.nextLine(), s.nextLine(), Double.parseDouble(s.nextLine()));
  
        		 databaseService.updateEmployee(employee);
        	 }
        	 break;
        	 
         case 6:
        	 System.out.println("thank ou");
        	 isRunning = false;
        	 break;     
         default:
             break;
         }
    	 
    		
    		
    		
    		
    		
    		
    		
    	}
     
	}catch(Exception e)
     {
		throw new RuntimeException("wrong" +e);
     }

}

	private static Object employeeById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}
