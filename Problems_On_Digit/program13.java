//write a java program which accept number from user and return the count of digit in between 3 & 7?
//Input :  2395     1018     9922    4521
//Output :  1        0        0       2 

import java.util.*;

class Numbers
{
    public int CountRange(int No)
    {
        int iCnt = 0;
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCnt++;
            }
            No = No / 10;
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
        int value = sobj.nextInt();

        Numbers obj = new Numbers();

        int ret = obj.CountRange(value);
        System.out.println("Number in between 3 & 7 are :  "+ret);
        
    }
}