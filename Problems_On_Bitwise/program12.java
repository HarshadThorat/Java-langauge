// write a program which accept number and position from user and OFF that bit. return modified number.
//input : 10  2
//output : 8

//0000 0000 0000 0000 0000 0000 0000 0001
// 0     0    0    0    0    0   0     1
//0X00000001

import java.util.*;


class Bitwise
{
    public int OFFBit(int No, int Pos)
    {
        int Mask = 0X00000001;
        int Result = 0;
        
        Mask = Mask << (Pos-1);
        
        Result = No ^ Mask;

        return Result;
         
    }
}


class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        System.out.println("Enter the Position");
        int pos = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.OFFBit(value,pos);
    
        System.out.println("Updated number is : "+ret);
        
    }
}