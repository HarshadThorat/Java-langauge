// write a program wich checks whether 15th bit is ON or OFF?

//0000 0000 0000 0000 0100 0000 0000 0000
// 0     0    0    0    4    0   0     0
//0X00004000


import java.util.*;


class Bitwise
{
    public boolean CheckBit(int No)
    {
        int Mask = 0X00004000;
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


class program1
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
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }
    }
}