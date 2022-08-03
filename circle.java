import java.util.*; 
import java.util.Scanner; 
class Circle
{ 
    double radius;
    Circle()
    { 
        radius=1; 
    } 
    Circle(double r)
    { 
        radius=r; 
    }
    double getArea()
    { 
        return 3.14*radius*radius; 
    } 
    double getPerimeter()
    { 
        return 2*3.14*radius;
    } 
}
class Main extends Circle
{ 
    public static void main(String args[])
    { 
        Circle c=new Circle();
        double rs,area,perimeter;
        Scanner s=new Scanner(System.in);
        area=c.getArea();
        perimeter=c.getPerimeter();
        System.out.println("area of circle is :" + area); 
        System.out.println("perimeter of circle is :" + perimeter); 
        System.out.print("\nenter the value of radius: "); 
        rs=s.nextDouble();
        Circle c1=new Circle(rs);
        area=c1.getArea();
        perimeter=c1.getPerimeter();
        System.out.println("area of circle is :" + area); 
        System.out.println("perimeter of circle is :" + perimeter); 
    }
}
