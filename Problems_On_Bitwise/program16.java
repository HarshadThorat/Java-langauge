// write a program which accept number from user and Count the number of ON(1) bits in it without using % and / operator
//input : 11
//output : 3

import java.util.*;


class Bitwise
{
    public int CountOne(int No)
    {
        int iCnt = 0;

        while(No != 0)
        {
            iCnt++;
            No = No & (No-1); 
        }
        return iCnt; 
    }
}


class program16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.CountOne(value);
    
        System.out.println("Number of ON bits are : "+ret);
        
    }
}