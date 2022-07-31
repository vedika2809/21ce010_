//id-21ce010,name-vedikabhalodi
import java.util.*;
public class q3 {
    static boolean lastDigit(int a,int b){
        if(a%10 == 0 && b% 10 == 0)
        {
            return true;
        }
        else if(b % 10 ==a || a % 10 == b || a ==b ){
            return true;
        }
        else 
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no");
        int b = sc.nextInt();
        System.out.println(lastDigit(a,b));
    }
}
