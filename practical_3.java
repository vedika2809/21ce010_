interface P
{ 
    int vP=2; void methodP();
}
interface P1 extends P
{ 
    int vP1=3; void methodP1();
}
interface P2 extends P
{ 
    int vP2=4; void methodP2();
}
interface P12 extends P1,P2
{ 
    int vP12=5; void methodP12();
}
class InterfaceInheritance implements P12
{
public void methodP()
{
   System.out.println("Interface method P called-");
}
public void methodP1()
{
   System.out.println("Interface method P1 called-");
}
public void methodP2()
{
   System.out.println("Interface method P2 called-");
}
public void methodP12()
{
   System.out.println("Interface method called-");
}
}
public class practical_3
{
    public static void main(String[] args)
    {
     InterfaceInheritance Intf=new
     InterfaceInheritance();
     Intf.methodP();
     System.out.println("Interface P constant:"+Intf.vP+"\n");
     Intf.methodP1();
     System.out.println("Interface P constant:"+Intf.vP1+"\n");
     Intf.methodP2();
     System.out.println("Interface P constant:"+Intf.vP2+"\n");
     Intf.methodP12();
     System.out.println("Interface P constant:"+Intf.vP12+"\n");
   }
}
//id-21ce010,name-vedika