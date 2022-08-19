package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;

import com.spring.orm.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext Context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao =  Context.getBean("studentDao",StudentDao.class);
//      Student student = new Student(21,"kkpatel","india");
//      int r=studentDao.insert(student);
//      System.out.println("done" + r);
    
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
        
      
      
      while(true)
      {
    	  System.out.println("Press 1 for add student");
          System.out.println("Press 2 for display all students");
          System.out.println("Press 3 for get detail of single students");
          System.out.println("Press 4 for delete students ");
          System.out.println("Press 5 for update students ");
          System.out.println("Press 6 for exit ");
      
      
      try {
    	  
    	 int input = Integer.parseInt(br.readLine());
    	 if(input==1)
    	 {
    		 
    	 }else if(input==2)
    	 {
    		 
    	 }
    	 switch(input)
    	 {
    	 case 1:
    		 
    		 System.out.println("enter id");
    		 int uId=Integer.parseInt(br.readLine());
    		 
    		 System.out.println("enter name");
    		 String uName = br.readLine();
    		 
    		 System.out.println("enter city");
    		 String uCity=br.readLine();
    		 
    		 Student s=new Student();
    		 s.setStudentId(uId);
    		 s.setStudentName(uName);
    		 s.setStudentCity(uCity);
    		 
    		 int r= studentDao.insert(s);
    		 System.out.println(r+"student added");
    		 System.out.println("----------------------------------------------------------------------");
    		 System.out.println();
    		 
    		
    		 break;
    		 
    	
    	 case 2:
    		List<Student> allStudents = studentDao.getAllStudents();
    		
    			for(Student st:allStudents)
    			{
    				System.out.println("Name:"+st.getStudentName());
    				System.out.println("Id:"+st.getStudentId());
    				System.out.println("City:"+st.getStudentCity());
    				System.out.println("--------------------------------------");
    				
    			}
    		
    		
    		
    		
    		 break;
    		 
    	 case 3:
    		 System.out.println("enter id");
    		 int userId=Integer.parseInt(br.readLine());
    		 Student student= studentDao.getStudent( userId);
    		 System.out.println("Name:"+ student.getStudentName());
				System.out.println("Id:"+student.getStudentId());
				System.out.println("City:"+student.getStudentCity());
				System.out.println("--------------------------------------");
    		 
    		 break;
    		 
    	 case 4:
    		 System.out.println("enter id");
    		 int id=Integer.parseInt(br.readLine());
    		 studentDao.deleteStudent(id);
    		 System.out.println("Student delete");
    		 break;
    		 
    	 case 5:
    		 System.out.println("enter id");
    		 
    		 System.out.println("student updated");
    		 break;
    		 
    	 case 6:
    		 
    		 boolean go = false;
    		 break;
    	 }
    	  
    	  
    	  
      }catch(Exception e)
      {
    	  System.out.println("invalid input try with one");
    	  System.out.print(e.getMessage());
      }
    
    }
     
    
    
    
    
    }
    
}
