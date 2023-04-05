//write a java program which accept number from user and return the Difference between Summation of Even and Odd digit ?
//Input :  2395            1018         8440     
//Output :  -15(2-17)      6(8-2)       16(16-0)    

import java.util.*;

class Numbers
{
    public int CountDiff(int No)
    {
        int EvenCnt = 0;
        int OddCnt = 0;
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit % 2 == 0)
            {
                EvenCnt = EvenCnt + iDigit;
            }
            else
            {
                OddCnt = OddCnt + iDigit;
            }
            No = No / 10;
        }
        return (EvenCnt - OddCnt);
    }     
}


class program15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Numbers obj = new Numbers();

        int ret = obj.CountDiff(value);
        System.out.println("Difference of Even and Odd Numbers are :  "+ret);
        
    }
}