// write a program wich checks whether first and last bit is ON or OFF?  first = 1 last = 32

//1000 0000 0000 0000 0000 0000 0000 0001
// 8     0    0    0    0    0   0    1
//0X80000001

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No)
    {
        int Mask = 0X80000001;
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


class program5
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
            System.out.println("1st and 32nd bit is ON");
        }
        else
        {
            System.out.println("1st and 32nd bit is OFF");
        }
    }
}