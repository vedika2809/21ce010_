//id-21ce010,name-vedikabhalodi
import java.util.*;

public class q10
{
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
}
    public static void main(String[] args)
    {
        StringBuffer text= new StringBuffer();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter text to Encrypt :");
        text.append(sc.next());
        System.out.println("Enter shift :");
        int s = sc.nextInt();
        String str = text.toString();
        System.out.println("Text : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(str, s));
    }
}
