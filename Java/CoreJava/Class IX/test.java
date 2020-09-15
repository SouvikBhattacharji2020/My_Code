import java.util.*;

class test {
    
     
     public static void details_teacher(String n, String a)
     {
       System.out.println("The teacher name is : "+n);
       System.out.println("The teacher address is : "+a);
         
     }
     public static void subject_teacher(String s, String S)
     {
       System.out.println("The Subject of the teacher is : "+s);  
        System.out.println("The Special Subject of the teacher is : "+S);   
     }
     public static void Salary_incometax_teacher(double sl)
     {
       System.out.println("The Salary of the teacher is : "+sl);
       double sl1=sl*12;
        double tax=0.0;
       if(sl1>=175000)
       {
         tax=((sl1*5)/100)/12;  
       }
       System.out.println("The Tax of the teacher is : "+tax);
     }
     
     public static void main(String[] args)
     {
         
      test mc = new test(); 
      
      double salary,incomtax_rate,phone;
      String name,address,subject,sp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter teacher name :");
      name=sc.nextLine();
      System.out.println("Enter teacher's address :");
      address=sc.nextLine();
      System.out.println("Enter teacher's Subject :");
      subject=sc.nextLine();
      System.out.println("Enter teacher's Spacial Subject :");
      sp=sc.nextLine();
      System.out.println("Enter teacher's Salary :"); 
      salary=sc.nextInt();
      
      mc.details_teacher(name,address);
      mc.subject_teacher(subject,sp);
      mc.Salary_incometax_teacher(salary);
      
      
     }
     
  
}