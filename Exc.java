class ExceptionExample extends Exception
{
    void arr()
    {
        int a = 0;
        int b = 45/a;
        System.out.println(b);
    }
}
class Exc
{
    public static void main(String args[])
    {
         ExceptionExample obj = new ExceptionExample();
         //try{
         obj.arr();
     }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception");
         }
    }
}
