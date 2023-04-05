// Write a program which accept string from user and count number of Small character.
// input :  "Marvellous"  
// output :   9

import java.util.*;

class Alphabate
{
    public int CountSmall(String s)
    {   
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            //System.out.println(s.charAt(i));
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    
}


class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        int ret = obj.CountSmall(str);

        System.out.println("Number of Small character are : "+ret);
    }    
} 