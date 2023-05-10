package worldline.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class WorldlineAssignment {

   
    public static void main(){
       Scanner sc = new Scanner(System.in);
System.out.println("Enter the Date ");

String date = sc.next();

SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
Date date2=null;
try {
//Parsing the String
date2 = dateFormat.parse(date);
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println("Enter the physics mark");
int phy=sc.nextInt();
        System.out.println("Enter the chemistry mark");
        int che=sc.nextInt();
          System.out.println("Enter the Maths/Biology mark");
        int mb=sc.nextInt();
          System.out.println("Enter the your community");
        String com=sc.next();
          System.out.println("Enter the UG cgpa");
        int ug=sc.nextInt();
          System.out.println("Enter the PG mark");
        int pg=sc.nextInt();
          System.out.println("Enter the Mode of Education");
        String edu=sc.next();
          System.out.println("Enter the interview mark");
        int im=sc.nextInt();
          System.out.println("Enter the no.of projects completed");
        int project=sc.nextInt();
          System.out.println("Enter the citizenship");
        String citizen=sc.next();
        int mean=(phy+che+mb)/3;
        if(ug>8 && pg >8 && project>=2 && edu="full" && citizen= "India" && im>=35 )
        {
            if(com="sc" || com="st"){
                if(marks>50)
    
            System.out.println("Candidate Selected");
                
            else{
                if(marks>60)
                System.out.println("candidate selected");
            }
        }        
        }
        else{
            System.out.println("Candidate Not Selected");
            
        }
 
        
        
        
        
        
        
        
        
        
            
        
        
        
    }
    
}
