//id-21ce010,name-vedikabhalodi
import java.util.*;

public class q4 {
    static public boolean arr123(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 2; i++) {
            // if (arr[i] != 1 && arr[i + 1] != 2 && arr[i + 2] != 3) {
            //     continue;
            // }
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        boolean flag = arr123(arr);
        System.out.println(flag);
        // Appending new elements at
        // the end of the list
        

        // String s = arr.toString();
        // if(s.contains("123"))
        // {
        // System.out.println("true");
        // }
        // for (int i = 0; i < n - 2; i++) {
        // if (arr[i] != 1 && arr[i + 1] != 2 && arr[i + 2] != 3) {
        // System.out.println("false");
        // //break;
        // }
// else if(arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3)
        // {System.out.println("true");
        // break;
        // }
        // }
    }
}
