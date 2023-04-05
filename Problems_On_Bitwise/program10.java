// write a program which accept number from user and ON its first 4 bit .return modified number
//input : 73
//output : 79

//0000 0000 0000 0000 0000 0000 0000 1111
// 0     0    0    0    0    0   0     f
//0X0000000f

import java.util.*;


class Bitwise
{
    public int ToggleBit(int No)
    {
        int Mask = 0X0000000f;
        int Result = 0;

        Result = No | Mask;

        return Result; 
    }
}


class program10
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