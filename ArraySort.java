//id-21ce010,name-vedika
public class ArraySort {
      public static void insertionSort(Object[] a) {
         for (int i=0;  i != a.length;  i = i+1) {
            Object itemToInsert = a[i];
            int j = i;
            while (j != 0  &&  a[j-1] > itemToInsert) {
               a[j] = a[j-1];  j = j-1;
            }
            a[j] = itemToInsert;
        }
    }
}