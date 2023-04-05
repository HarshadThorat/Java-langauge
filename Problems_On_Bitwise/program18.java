// write a program which accept one number, two position from user and check whether bit at first or bit at second positon is ON or OFF?
//input : 10  3  7  
//output : true

//0000 0000 0000 0000 0000 0000 0000 0000
// 0     0    0    0    0    0    0     0
//0X00000000

import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No, int Pos1, int Pos2)
    {
        int Mask1 = 0X00000001;
        int Mask2 = 0X00000001;
        int Result = 0;
        int Mask = 0;

        Mask1 = Mask1 << (Pos1-1);
        Mask2 = Mask2 << (Pos2-1);
        Mask = Mask1 | Mask2;
        
        Result = No & Mask;

        if(Result == Mask)
        {
            return true;
        }
        else
        {
            return false;
        }
         
    }
}


class program18
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean ret = false;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        System.out.println("Enter the first position");
        int pos1 = sobj.nextInt();

        System.out.println("Enter the second position");
        int pos2 = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.CheckBit(value, pos1 , pos2);

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