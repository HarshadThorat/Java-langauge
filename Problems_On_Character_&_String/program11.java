// Write a program which accept string from user and count number of capital character.
// input :  "Marvellous Multi OS"  
// output :   4

import java.util.*;

class Alphabate
{
    public int CountCapital(String s)
    {   
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    
}


class program11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        int ret = obj.CountCapital(str);

        System.out.println("Number of capital character are : "+ret);
    }    
} 