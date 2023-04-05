//write a java program which accept string fronm user and count number of Small character
// input  :  Marvellous
// output :  9


import java.util.*;

class Alphabate
{
    public int CountSmall(String s)
    {
        int iCnt = 0;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
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

        int ret = obj.CountSmall(str);
        System.out.println("Number of Small character are : "+ret);
        
    }
}