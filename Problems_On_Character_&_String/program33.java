//Write a program which 2 strings from user and check whether first N character of two strings are equal or not.
// Input : Marvellous Infosystem
//         Marvellous Infosystem
//         10
//output : TRUE

import java.util.*;

class Alphabate
{
    public void StrCmp(String s1,String s2,int no)
    {
        String str1 = "";
        String str2 = "";

        char Arr1[] = s1.toCharArray();
        char Arr2[] = s2.toCharArray();

        for(int i = 0; i < no; i++)
        {
            str1 = str1 + Arr1[i];
        }
        
        for(int i = 0; i < no; i++)
        {
            str2 = str2 + Arr2[i];
        }

        if(str1.equals(str2))
        {
            System.out.println("first 10 character  is equal");
        }
        else
        {
            System.out.println("first 10 charater is NOT equal");
        }
    }
}

class program33
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String1");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter the String2");
        String str2 = sobj.nextLine();

        System.out.println("Enter the number");
        int No = sobj.nextInt();

        Alphabate obj = new Alphabate();

        obj.StrCmp(str1,str2,No);
    }
}