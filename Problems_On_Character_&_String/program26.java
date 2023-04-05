//write a java program which accept string fronm user and count number of capital character
// input  :  Marvellous Multi OS
// output :  4


import java.util.*;

class Alphabate
{
    public int CountCapital(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}


class program26
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        Alphabate obj = new Alphabate();

        int ret = obj.CountCapital(str);
        System.out.println("Number of capital character are : "+ret);
        
    }
}