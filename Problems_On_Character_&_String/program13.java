// Write a program which accept string from user and return diff between frequency of small character andfrequency of capital character.
// input :  "MarvellouS"  
// output :   6   (8-2)

import java.util.*;

class Alphabate
{
    public int Difference(String s)
    {   
        int iCapitalCnt = 0;
        int iSmallCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            //System.out.println(s.charAt(i));
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCapitalCnt++;
            }
            else
            {
                iSmallCnt++;
            }
        }
        return iSmallCnt - iCapitalCnt;
    }    
}


class program13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        int ret = obj.Difference(str);

        System.out.println("Difference of character are : "+ret);
    }    
} 