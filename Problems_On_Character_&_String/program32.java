//Write a program which 2 strings from user and check whether contents of two strings are equal or not.
// Input : Marvellous Infosystem
//         Marvellous Infosystem
//         
//output : TRUE

import java.util.*;

class Alphabate
{
    public void StrCmp(String s1,String s2)
    {
        if(s1.equals(s2))
        {
            System.out.println("Contenet of string is equal");
        }
        else
        {
            System.out.println("Contenet of string is NOT equal");
        }
    }
}

class program32
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String1");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter the String2");
        String str2 = sobj.nextLine();

        Alphabate obj = new Alphabate();

        obj.StrCmp(str1,str2);
    }
}