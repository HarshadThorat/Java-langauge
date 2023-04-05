// Write a Program which accept distance in kilometre and convert it into meter. 
// (1 kilometre 1000 Meter)
// Input : 5
// Output: 5000

import java.util.*;
 
class Numbers
{
    public int No;
    
    public Numbers(int i)
    {
        No = i;
    }

    public int KMtoMeter()
    {
        int Ans = 0;

        Ans = No * 1000;
        return Ans;
    }

}


class Program41
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Enter the Distance in KiloMeter");
        int No1 = sobj.nextInt();

        Numbers obj = new Numbers(No1);

        int ret = obj.KMtoMeter();
        System.out.println("Distance in meter is : "+ret);
    }
}
