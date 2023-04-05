// write a program which accept number and position from user and check whether bit at that position is ON or OFF.
//input : 10  2
//output : true

//0000 0000 0000 0000 0000 0000 0000 0001
// 0     0    0    0    0    0   0     1
//0X00000001

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No, int Pos)
    {
        int Mask = 0X00000001;
        int Result = 0;
        boolean flag = false;

        Mask = Mask << (Pos-1);
        
        Result = No & Mask;

        if(Result == Mask)
        {
            flag = true;
        }

        return flag;
         
    }
}


class program11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean ret = false;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        System.out.println("Enter the Position");
        int pos = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.CheckBit(value,pos);

        if(ret == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}