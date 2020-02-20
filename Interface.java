import java.io.*;
interface i1 
{
  void show1();
  default void show3()
  {
  System.out.println("Show3");
  }
}
interface i2
{
void show2();
}
interface i3 extends i1,i2
{
    void display();

}
class A implements i1,i2,i3
{
    public void show1(){
    System.out.println("Show1");
    }
    public void show2(){
    System.out.println("Show2");
    }
    public void show3(){
    System.out.println("Show 3 overridden");
    }
    public void display(){
    System.out.println("Display");
    }
    void showa(){
    System.out.println("Class A method");
    }
}
class B extends A implements i1
{
    public void show1(){
    System.out.println("Show1 B class");
    }

}
class Interface
{
    public static void main(String []args){
  /*  A obj = new A();
    obj.show1();
    obj.show2();
    obj.show3();
    obj.display();*/
    B b = new B();
    b.show1();
    b.showa();
    }
}
