
package javaphase3;


import java.io.Serializable;
import java.util.Arrays;
  
import javax.swing.JOptionPane;


public class Course  implements Serializable{  
public Student[] student; 
private String courseName;  
private String courseCode;  
private int courseCapasity;  
private int numOfStudents;  
private Teacher teacher; 



private String firstName;  
private String LastName;  
private String email;  


public Course (String courseName, String courseCode, int size,String firstName, String lastNmae, String email, double salary,int yearsOfwork,int absensDays) {  
 
   //vaildate input 
 if (size <= 0) {
        throw new ArrayIndexOutOfBoundsException("Invalid course capacity!! course can't be added");
    }
    
this.courseCode=courseCode;  
this.courseName=courseName;  
this.courseCapasity=size; 
this.student=new Student[size];
this.teacher = new Teacher(firstName,  lastNmae,  email,  salary, yearsOfwork,absensDays);   
this.numOfStudents=0; 
JOptionPane.showMessageDialog(null, "course added successfully!");} 

  
 

public boolean CanSignIn() {  
// Check if the course is full  
 try{
            if (numOfStudents >= courseCapasity) {
                // Unchecked ArrayIndexOutOfBoundsException if trying to add beyond the array size
                throw new ArrayIndexOutOfBoundsException();}
            else  
return true; 
            } catch (ArrayIndexOutOfBoundsException outofbound){
            JOptionPane.showMessageDialog(null,"Cannot add more students. The course is full.");
     return false;  }
   }  

 

 // Method to add a student to the course
    public void addStudent(String firstName,String LastName , String email) {
        if (CanSignIn()) {
            // Adding a student to the course if it's not full
            student[numOfStudents++] = new Student(firstName, LastName, email);
           JOptionPane.showMessageDialog(null,"student add successfully.");
        }
    }
 
 

boolean SearchForStudent(String firstName) {  
String target= firstName; 
for( int i = 0 ;i < numOfStudents ; i++ )  
if( student[i].firstName.equals(target) ) { 
JOptionPane.showMessageDialog(null,target +" is found"); 
return true; } 
JOptionPane.showMessageDialog(null,"Student not found"); 
return false;}  

 
 

public void deleteStudent(String firstName) {	  
// checks if they are taking the course
String target=firstName; 
for( int i = 0 ; i < numOfStudents ; i++ ) {  
if (student[i].getFirstName().equals(target)) {  
student[i] = student[ numOfStudents - 1] ;  
student[--numOfStudents]=null ;  
JOptionPane.showMessageDialog(null,"Student deleted successfully."); 
return;
  }  
} 
JOptionPane.showMessageDialog(null,"can't delete becuse student is not found."); 

} 
 public String getCourseName()  {
    return courseName+ courseCode+ " "+teacher+" "+courseCapasity;
 }
}

 