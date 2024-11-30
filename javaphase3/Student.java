
package javaphase3;

import java.io.*;
import java.io.Serializable;
public class Student extends Member implements Serializable {


public Student(String firstName, String lastName, String email) {
super(firstName, lastName, email); }



public String toString() {
return "Student first Name= " + firstName + ", last Name= " + lastName + "\n"; }


}