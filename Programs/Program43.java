//Write a program which accept area in square feet and convert it into square meter. 
// (1 square feet = 0.0929 Square meter)
// Input: 5
// Output: 0.464515

import java.util.*;
 
class Numbers
{
    public int No;

    public Numbers(int i)
    {
        No = i;
    }

    public double SquareMeter()
    {
        double Ans = 0.0;

        Ans = No * 0.0929;
        return Ans;
    }

}


class Program43
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the area into square feet");
        int No1 = sobj.nextInt();

        Numbers obj = new Numbers(No1);

        double ret = obj.SquareMeter();
        System.out.println("Value in square meter is : "+ret);
    }
}
