import java.util.Scanner;
import java.io.*;
class Tax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        int ia,s1,s2,s3,tax;
        System.out.println("Input the number of person:");
        n = sc.nextInt();
        int t[][] = new int[n][7];
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("Input the Person no:");
                t[i][j] = sc.nextInt();
                j++;
                System.out.print("Input the Income of person in lacs:");
                t[i][j] = sc.nextInt();
            }
        }
        j=1;
        for(i=0;i<n;i++)
        {
            
            while(j<7)
            {
                if(t[i][j]<250000)
                {
                    ia = t[i][j];
                    j++;
                    t[i][j] = ia;
                    s1 = 0;
                    j++;
                    t[i][j] = s1;
                    j++;
                    s2 = 0;
                    t[i][j] = s2;
                    j++;
                    s3 = 0;
                    t[i][j] = s3;
                    j++;
                    tax = 0;
                    t[i][j] = tax;
                }
                else if(t[i][j]>=500000)
                {
                    ia = t[i][j];
                    j++;
                    t[i][j] = ia;
                    s1 = (ia - 250000);
                    j++;
                    t[i][j] = s1;
                    j++;
                    s2 = 0;
                    t[i][j] = s2;
                    j++;
                    s3 = 0;
                    t[i][j] = s3;
                    j++;
                    tax = (s1*5)+(s2*20)+(s3*30);
                    t[i][j] = tax/100;
                }
                else if (t[i][j]>=2000000)
                {
                    ia = t[i][j];
                    j++;
                    t[i][j] = ia;
                    s1 = (ia - 250000);
                    j++;
                    t[i][j] = s1;
                    j++;
                    s2 = (ia-5);
                    t[i][j] = s2;
                    j++;
                    s3 = 0;
                    t[i][j] = s3;
                    j++;
                    tax = (s1*5)+(s2*20)+(s3*30);
                    t[i][j] = tax/100;
                }
                else if (t[i][j]>=3000000)
                {
                    ia = t[i][j];
                    j++;
                    t[i][j] = ia;
                    s1 = (ia - 250000);
                    j++;
                    t[i][j] = s1;
                    j++;
                    s2 = (ia-500000);
                    t[i][j] = s2;
                    j++;
                    s3 = (ia-2000000);
                    t[i][j] = s3;
                    j++;
                    tax = (s1*5)+(s2*20)+(s3*30);
                    t[i][j] = tax/100;
                }
                j++;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<7;j++)
            {
            System.out.println("Person No:"+t[i][j]);
            j++;
            System.out.println("Income of Person:"+t[i][j]);
            j++;
            System.out.println("Income Assumption:"+t[i][j]);
            j++;
            System.out.println("Income for Slab 1:"+t[i][j]);
            j++;
            System.out.println("Income for Slab 2:"+t[i][j]);
            j++;
            System.out.println("Income for Slab 3:"+t[i][j]);
            j++;
            System.out.println("Total tax:"+t[i][j]);
            }
        }
    }
}
