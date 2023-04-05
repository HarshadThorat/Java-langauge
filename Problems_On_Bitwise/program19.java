//write a program ehich accept one number from user and range of position from user Toggle all bits from that range. 
//Input = 897   9  13

import java.util.*;


class Bitwise
{
    public int ToggleRange(int No, int Start, int End)
    {
        int Mask1 = 0XFFFFFFFF, Mask2 = 0XFFFFFFFF, Mask = 0, Result = 0;

        Mask1 = Mask1 << (start - 1);
        Mask2 = Mask2 >> (32 - End);
        Mask = Mask1 & Mask2;

        Result = No ^ Mask;

        return Result;
         
    }
}

class program19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        System.out.println("Enter the start position");
        int start = sobj.nextInt();

        System.out.println("Enter the end position");
        int end = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.ToggleRange(value, start, end);

        cout<<"Updated number is : "<<ret<<"\n";
    }
}