// write a program wich checks whether 7th,8th & 9th bit is ON or OFF?

//0000 0000 0000 0000 0000 0001 1100 0000
// 0     0    0    0    0    1   C    0
//0X000001C0

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No)
    {
        int Mask = 0X000001C0;
        int Result = 0;
        boolean flag = false;

        Result = No & Mask;

        if(Result == Mask)
        {
            flag = true;
        }

        return flag; 
    }
}


class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bret = false;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        bret = obj.CheckBit(value);

        if(bret == true)
        {
            System.out.println("7th,8th & 9th bit is ON");
        }
        else
        {
            System.out.println("7th,8th & 9th bit is OFF");
        }
    }
}