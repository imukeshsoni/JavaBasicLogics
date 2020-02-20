import java.util.Scanner;
import java.io.*;
interface data
{
  static  int profit( int[] x);
  static  int loss(int[] s);
    

}
class Revenue implements data
{
    static int profit(int [] x)
    {
        for(int i= 0; i<x.length; i++)
        {
        int sum = sum + x[i];
        } 
    }
    static int loss(int[] l)
    { 
    for(int i= 0; i<x.length; i++)
        {
        int loss = loss + x[i];
        } 
    }
    

}
class Company1 extends Revenue
{
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many branches you want to save:");
    int n = sc.nextInt();
    String branchname[] = new String[n];
    int profit[] = new int[n];
    int  loss[] = new int[n];
    for(int i = 0; i<n; i++)
    {
            System.out.println("Welcome Disrtibutor!");
            System.out.println("Tell us your Branch name:");
            branchname[i] = sc.nextLine();
            System.out.println("Enter this year's profit(Hope it's increases by the time :) :");
            profit[i] = sc.nextInt();
            System.out.println("Enter this year's loss (if not, Enter 0):");
            loss[i] = sc.nextInt();
    }
    int p = profit(Revenue.profit[]);
    System.out.println("Total profit :" +profit(profit));
    System.out.println("Total loss:" +loss(loss));
    
    }
}

