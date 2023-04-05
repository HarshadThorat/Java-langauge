//write a java program which accept string from user and return difference between frequency of small character and frequency of capital character.
// input  :  MarvellouS
// output :  6 (8-2)


import java.util.*;

class Alphabate
{
    public int CountDiff(String s)
    {
        int iCapitalCnt = 0;
        int iSmallCnt = 0;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iSmallCnt++;
            }
            else
            {
                iCapitalCnt++;
            }
        }
        return iSmallCnt - iCapitalCnt;
    }
}


class program27
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        Alphabate obj = new Alphabate();

        int ret = obj.CountDiff(str);
        System.out.println("Difference is : "+ret);
        
    }
}