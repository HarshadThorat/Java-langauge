//write a java program which accept number from user and return the count of Odd digit
//Input :  2395     1018     8462
//Output :  3        2        0

import java.util.*;

class Numbers
{
    public int OddDigit(int No)
    {
        int iCnt = 0;
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit % 2 != 0)
            {
                iCnt++;
            }
            No = No / 10;
        }
        return iCnt;
    }     
}


class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Numbers obj = new Numbers();

        int ret = obj.OddDigit(value);
        System.out.println("Number of Odd Digit are :  "+ret);
        
    }
}