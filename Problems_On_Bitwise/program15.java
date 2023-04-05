// write a program which accept number and position from user and Toggle Contents of first and last nibble of the number .return modified number.

//0000 0000 0000 0000 0000 0000 0000 1001
// 0     0    0    0    0    0   0     9
//0X00000009


import java.util.*;


class Bitwise
{
    public int ToggleBit(int No)
    {
        int Mask = 0X00000009;
        int Result = 0;
        
        Result = No ^ Mask;

        return Result;
         
    }
}


class program15
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