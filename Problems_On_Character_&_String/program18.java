// Write a program which accept string from user and convert it into toggle the case.
// input :  "Marvellous Multi OS"  
// output :   mARVELLOUS mULTI os

import java.util.*;

class Alphabate
{
    public void Toggle(String s)
    {   
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
            else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        System.out.print(Arr);

    }     
        
}


class program18
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        obj.Toggle(str);

        
        
    }    
} 