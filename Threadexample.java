import java.io.*;
class Reserve implements Runnable
{
    int available = 10;
    int wanted;
    Reserve(int i)
    {
        wanted = i;
    }
    public void  run()
    {
        synchronized(this){
        System.out.println("Available Berth = "+available);
        System.out.println("Priority of Thread: "+Thread.currentThread().getName() +" "+ Thread.currentThread().getPriority());
        if(available>=wanted)
        {
            String name = Thread.currentThread().getName();
            System.out.println(wanted +" berth reserved for "+name);

            try{
                Thread.sleep(3000);
                available -= wanted;
            }catch(InterruptedException e)
            {e.printStackTrace();}
        }
        else{
        System.out.println("Sorry no berth available");

        }
        }
    }
    

}
class Threadexample
{
    public static void main(String []args){
        Reserve obj = new Reserve(6);
        
        Thread t2 = new Thread(obj);
        Thread t1 = new Thread(obj);
        t2.setPriority(1);
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    t2.setName("Maahi");
        t1.setName("Mukesh");
        t2.start();
        t1.start();
        

        }

}
