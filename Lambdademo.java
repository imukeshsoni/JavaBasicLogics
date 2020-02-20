interface A
{
    public void show();
}

class Lambdademo implements A
{
    public static void main(String []args) throws Exception
    {
    
    A obj;
    obj = () -> System.out.println("Show method called!!");
    obj.show();
    
    }
}
