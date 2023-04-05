//write a java program which accept number from user and return the Multiplication of digit ?
//Input :  2395     1018     9440     
//Output :  270       8       144    

import java.util.*;

class Numbers
{
    public int MultiDigit(int No)
    {
        int Mult = 1;
        int iDigit = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit < 1)
            {
                iDigit = 1;
            }
            Mult = Mult * iDigit;
            No = No / 10;
        }
        return Mult;
    }     
}


class program14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        Numbers obj = new Numbers();

        int ret = obj.MultiDigit(value);
        System.out.println("Multiplication of all Digits  are :  "+ret);
        
    }
}