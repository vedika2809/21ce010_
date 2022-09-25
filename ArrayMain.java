//id-21ce010,name-vedika
import java.util.*;
class Array extends Thread

{
    void Even(int arr[], int n)
    {
        int even = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even = arr[i];
        }
        System.out.println("Even Index : " + even);
    }
}

class Array1 extends Thread
{
    void Odd(int arr[], int n)
    {
        int odd = 1;
        for (int i = 0; i < a1.n; i++) {
            if (i % 2 == 0)
                odd = a1.arr[i];
        }
        System.out.println("Odd Index : " + odd);
   }
}

public class ArrayMain
{
    public static void main(String []args)
    {
        int arr[] = { 1, 23, 34, 56, 21, 77, 45, 96, 14, 63, 90, 22, 53, 66, 15 };
        int n = arr.length;
        //EvenOdd(arr[], n);

        Array a=new Array();
        Even(arr, n);
        Array1 a1=new Array1();
        Odd(arr, n);

        Thread t1=new Thread(a);
        Thread t2=new Thread(a1);

        System.out.println(t1);
        System.out.println(t2);
    }
}