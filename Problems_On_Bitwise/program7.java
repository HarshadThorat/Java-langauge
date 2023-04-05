// write a program which accept number from user and OFF 7th and 10th bit of that number if it is on,return modified number
//input : 577
//output : 1

//1111 1111  1111 1111 1111 1101 1011 1111 
// f     f     f    f    f    D   B    f
//0XfffffDBf


import java.util.*;


class Bitwise
{
    public int OFFBit(int No)
    {
        int Mask = 0XfffffDBf;
        int Result = 0;

        Result = No & Mask;

        return Result; 
    }
}


class program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ret = 0;

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Bitwise obj = new Bitwise();

        ret = obj.OFFBit(value);

       System.out.println("Updated number is : "+ret);
        
    }
}