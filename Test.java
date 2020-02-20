import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        int st=1;
        int count = 0;
        char c;
        
        for(int i=0;i<=s.length();++i)
        {
            c = s.charAt(i);
            if(c == 'L')
            {
                --st;
                if(st==0)
                {
                    ++count;
                }
            }
            else{
                
            ++st;
                if(st==0)
                {
                    ++count;
                }
            }
        }
        System.out.println(count);
        System.out.println(st);
}
    

}
