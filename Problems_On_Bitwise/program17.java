// write a program wich checks whether 5th and 18th bit is ON or OFF?
//input : 257  
//output : false

//0000 0000 0000 0010 0000 0000 0001 0000
// 0     0    0    2    0    0    1     0
//0X00020010

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No)
    {
        int Mask = 0X00020010;
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


class program17
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean ret = false;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.CheckBit(value);

        if(ret == true)
        {
            System.out.println("5th and 18th Bit is ON");
        }
        else
        {
            System.out.println("5th and 18th Bit is OFF");
        }
    }
}