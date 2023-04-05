// write a program wich checks whether 7th,15th,21th,28th bit is ON or OFF?

//0000 1000 0001 0000 0100 0000 0100 0000
// 0     8    1    0    4    0   4     0
//0X08104040

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No)
    {
        int Mask = 0X08104040;
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


class program3
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
            System.out.println("7th,15th,21th,28th bit is ON");
        }
        else
        {
            System.out.println("7th,15th,21th,28th bit is OFF");
        }
    }
}