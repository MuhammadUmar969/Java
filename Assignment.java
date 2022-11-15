package assignment;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> courselist = new ArrayList<String>();
        ArrayList<Integer> markslist = new ArrayList<Integer>();
      
        
        System.out.print("Enter Semester: ");
        int semes = input.nextInt();
        System.out.print("Enter no of courses: ");
        int course=input.nextInt();
        
       String course1;
        for(int i=0 ; i<course; i++){
            System.out.print("Enter course " + (i+1) + " : " );
            course1 = input.next();
            courselist.add(course1);   
        } 
         int marks;
        for(int i=0 ; i<5; i++){
            System.out.print("Enter marks " + (i+1) + " : " );
            marks = input.nextInt();
            markslist.add(marks);   
        } 
      
        int avg =0;
        for(int i=0 ; i<course ; i++){
            avg += markslist.get(i);
           
        }
        int average=(avg/course);
       System.out.println("Average marks :" +average); 
     System.out.println(Collections.max(markslist));
     System.out.println(Collections.min(markslist));      
    }
    
}
