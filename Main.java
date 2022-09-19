//id-21ce010,name-vedika
public class Main {

    public static void main(String[ ] args) {
    
    try {
    
    int[] myNumbers = {1, 2, 3};
    
    System.out.println(myNumbers[10]);
    } 
    catch (Exception e) {

    System.out.println("Something went wrong.");
    
    }
    
    int num1, num2;
    
    try {
    
    num1 = 0;
    
    num2 = 62 / num1;
    
    System.out.println(num2);
    
    System.out.println("End of try block");
    
    }
    
    catch (ArithmeticException e) {
    
    System.out.println("You should not divide a number by zero");
    
    }
    
    catch (Exception e) {
    
    System.out.println("Exception occurred");
    
    }
    
    String ptr = null;
    
    try
    
    {
    
    if (ptr.equals("gfg"))
    
    System.out.print("Same");
    
    else
    System.out.print("Not Same");

}

catch(NullPointerException e)

{

System.out.println("NullPointerException Caught");

}

System.out.println("I'm out of try-catch block in Java.");

}

}        