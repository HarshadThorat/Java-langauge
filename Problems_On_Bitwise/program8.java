// write a program which accept number from user and Toggle 7th bit of that number if it is on,return modified number
//input : 137
//output : 201

//0000 0000 0000 0000 0000 0000 0100 0000
// 0     0    0    0    0    0   4     0
//0X00000040


import java.util.*;


class Bitwise
{
    public int ToggleBit(int No)
    {
        int Mask = 0X00000040;
        int Result = 0;

        Result = No ^ Mask;

        return Result; 
    }
}


class program8
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