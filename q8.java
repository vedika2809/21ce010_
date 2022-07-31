//id-21ce010,name-vedikabhalodi
import java.util.Scanner;
class q8{
char answer[][] = new char[8][10];
char key[] = {'D','B','D','C','C','D','A','E','A','D'};
public void getAnswer()
{
   Scanner sc = new Scanner(System.in);
   for (int I = 0; I < 8; i++) {
   System.out.println("Enter answer of Student: "+(i+1));
   for (int j = 0; j < 10; j++) {
   answer[i][j] = sc.next().charAt(0);
  }
 }
}
  void checkAnswer()
  {
     for (int I = 0; I < 8; i++) {
     int count = 0;
     for (int j = 0; j < 10; j++) {
     if(answer[i][j] == key[j])
     {
        count++;
     }
    }
    System.out.println("Marks of Student: "+(i+1)+" : "+count);
   }
}
  public static void main(String[] args) {
  q8 p = new q8();
  p.getAnswer();
  System.out.println("\n");
  p.checkAnswer();
  } 
}
