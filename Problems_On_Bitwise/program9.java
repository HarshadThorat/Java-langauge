// write a program which accept number from user and Toggle 7th and 10th bit of that number if it is on,return modified number
//input : 137
//output : 713

//0000 0000 0000 0000 0000 0010 0100 0000
// 0     0    0    0    0    2   4     0
//0X00000240

import java.util.*;


class Bitwise
{
    public int ToggleBit(int No)
    {
        int Mask = 0X00000240;
        int Result = 0;

        Result = No ^ Mask;

        return Result; 
    }
}


class program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.ToggleBit(value);

       System.out.println("Updated number is : "+ret);
        
    }
}