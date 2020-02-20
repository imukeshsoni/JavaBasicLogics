import java.util.Scanner;
import java.io.*;
interface data
{
   public void getdata();
   public void print();

}
class Branches implements data
{
    Scanner sc = new Scanner(System.in);
    int bdata( int n1)
    {
    extern n = n1; 
    }
    String branchname[] = new String[n];
    int profit[] = new int[n];
    int  loss[] = new int[n];
    public void getdata()
    {
        for (int i= 0; i<n; i++)
        {
            System.out.println("Welcome Disrtibutor!"+ i);
            System.out.println("Tell us your Branch name:");
            branchname[i] = sc.nextLine();
            System.out.println("Enter this year's profit(Hope it's increases by the time :) :");
            profit[i] = sc.nextInt();
            System.out.println("Enter this year's loss (if not, Enter 0):");
            loss[i] = sc.nextInt();
        }
    }
    
}
class Head extends Branches
{   
        Head()
        {
            System.out.println("Welcome to Head Department");
            System.out.println("For the very first time kindly enter the number of branches you have, We'll save their details:");
            int n = sc.nextInt();
            System.out.println("Thank You For providing the details, We're moving to Distributors");
            void bdata(n);
        }
        void print()
    {
        for (int i= 0; i<n; i++){
        System.out.println("Name of Distributor:" + branchname[i]);
        System.out.println("Profit of Distributor:" + profit[i]);
        System.out.println("loss of Distributor:" + loss[i]);
    }

}
class Company extends Branches
{
    public static void main(String []args)
    {
        Head hobj = new Head();
        hobj.getdata();
        hobj.print();
    }
}

