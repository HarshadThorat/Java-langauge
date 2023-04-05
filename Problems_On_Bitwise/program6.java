// write a program which accept number from user and OFF 7th bit of that number if it is on,return modified number

//1111 1111  1111 1111 1111 1111 1011 1111 
// f     f     f    f    f    f   B    f
//0XffffffBf

import java.util.*;


class Bitwise
{
    public int OFFBit(int No)
    {
        int Mask = 0XffffffBf;
        int Result = 0;

        Result = No & Mask;

        return Result; 
    }
}


class program6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.OFFBit(value);

       System.out.println("Updated number is : "+ret);
        
    }
}