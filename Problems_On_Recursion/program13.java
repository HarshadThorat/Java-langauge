//write a Recursive program which accept string from user and Count number of character?
//Input : Hello
// output : 5
// incomplete

import java.util.*;

class Recursion
{
    static int iCnt = 0;
    static int i = 0;

    public int CountCharR(String s)
    {
        if(s.charAt(i) != ' ')
        {
            iCnt++;
            i++;
            CountCharR(s);    
        }
        
        return iCnt;
    } 
}


class program13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        String str = sobj.nextLine();

        Recursion obj = new Recursion();
        int ret = obj.CountCharR(str);

        System.out.println("Number of characters are : "+ret);
    }

}