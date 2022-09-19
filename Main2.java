public class Main2 {

    static void checkAge(int age) throwsArithmeticException {
    
    if (age < 18) {
    
    throw newArithmeticException("Access denied.");
    
    }
    
    else {
    
    System.out.println("Access granted");
    
    }
    
    }

    public static void main(String[] args) {

        checkAge(15);
        
        }
        
        }
        
        
        
        import java.io.*;
        
        class M{
        
        void method()throws IOException{
        
        throw new IOException("device error");
        
        }
        
        }
        
        class Testthrows4{
        
        public static void main(String args[])throws IOException{
        
        M m=new M();
        
        m.method();
        
        
        
        System.out.println("normal flow...");
        
        }
        
        }
            