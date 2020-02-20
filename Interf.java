interface Inter{

   public void show();

}

abstract class Interf implements Inter
{
    public static void main(String []args) throws Exception{
    Inter ref;
    ref = () -> System.out.println("Show Method");
    ref.show();
    }
}
