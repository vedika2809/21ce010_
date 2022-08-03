import java.util.*;
public class Addition 
{ 
// Method to calculate the sum of two numbers. 
// Declare an instance method sum with two parameters a and b having data type int. 
   void sum(int a, int b) 
   { 
     int s = a + b; 
     System.out.println("Sum of two numbers: " +s); 
   } 
// Method to calculate sum of three numbers. 
// Declare an instance method sum with three parameters a,b, and c having data type int. 
// Here, the method sum() is overloaded having the same method name. 

   void sum(int a, int b, int c) 
   { 
     int t = a + b + c; 
     System.out.println("Sum of three numbers: " +t); 
   } 
public static void main(String[] args) 
{ 
   Addition a = new Addition(); 
    a.sum(10, 20); // It will call sum() method to calculate sum of two arguments. 
    a.sum(50, 100, 200); // It will call sum() method to calculate sum of three arguments. 
  } 
 }