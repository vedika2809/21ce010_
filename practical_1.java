abstract class Geometricobject
{
 abstract void getArea();
 abstract void getPerimeter();
}
class circle extends Geometricobject
{
  Scanner sc=new Scanner(System.in);
  float radius; 
  void getArea()
  {
    System.out.println("Enter radius of circle :");
    radius=sc.nextInt();
    System.out.println("Area ofcircle:"+3.14*radius*radius);
  }
  void getPerimeter()
  {
    System.out.println("perimeter of circle:"+2*3.14*radius);
  } 
} 
class rectangle extends Geometricobject
{
   Scanner sc=new Scanner(System.in); 
   int l,b;
   void getArea()
   {
     System.out.println("Enter length and breadth of rectangle "); 
     l=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Area of rectangle: "+l*b);
   }
   void getPerimeter()
   {
    System.out.println("Perimeter of rectangle :"+2*(l+b));
   } 
}
class TestGeometricObject
{
  void getArea(int a, int b, int c,int d)
  {
    int s1=a; 
    int s2=b; 
    int s3=c;
    int h1= d;
    System.out.println("Area of triangle is :"+0.5*s2*h1);
  }
  void getPerimeter(int p, int q, int r)
  {
    int a=p; int b=q; int c=r;
    System.out.println("Perimeter of triangle is :"+a+b+c);
  }
}

public class practical_1 {
    public static void main(String[] args) {
    Geometricobject OC=new circle();
    Geometricobject OR = new rectangle();
    TestGeometricObject OT=new TestGeometricObject();
    OC.getArea();
    OC.getPerimeter();
    OR.getArea();
    OR.getPerimeter();
    System.out.println("FOR TRIANGLE ");
    OT.getArea(4,5,6,7);
    OT.getPerimeter(4,5,6);
    }
}
//id-21ce010,name-vedika