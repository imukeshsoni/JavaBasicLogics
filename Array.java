import java.io.*;
import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s[][] = new int[5][3];
        int i,j,p=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<3;j++)
            {
            System.out.print("Input the roll no:");
            s[i][j] = sc.nextInt();
            j++; //this will take the input in next column as the table
            System.out.print("Input marks of first subject:");
            s[i][j] = sc.nextInt();
            j++;
            System.out.print("Input marks of second subject:");
            s[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int max = s[0][1]; //Considering 1st value of first subject as maximum
        for(i=0,j=1;i<5;i++) //Fixing the value of column and only increasing the row number
        {
            if(s[i][j]>max)
            {
                max = s[i][j]; //Comparing maximum
                p = s[i][0];
            }
        }
        System.out.println("Maximum marks of first subject is of roll no:"+p);
          max = s[0][2]; //Considering 1st value of second subject as maximum
        for(i=0,j=2;i<5;i++) //Fixing the value of column and only increasing the row number
        {
            if(s[i][j]>max)
            {
                max = s[i][j]; //Comparing maximum
                p = s[i][0];
            }
        }
        System.out.println("Maximum marks of second subject is of roll no:"+p);
    }
}
