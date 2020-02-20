import java.io.*;
class Handleexception
{
    public static void main(String args[])
    {
        try{
        int d = 10;
        int a = 45/d;
        System.out.println(a);
        int c[] = {1};
        c[43] = 20;
            }catch(ArithmeticException e)
            {e.printStackTrace();}
            catch(ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();}
    }
}
