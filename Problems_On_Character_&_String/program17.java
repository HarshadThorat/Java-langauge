// Write a program which accept string from user and convert it into Upper case.
// input :   marvellous multi os 
// output :  "Marvellous Multi OS" 

import java.util.*;

class Alphabate
{
    public void strUpr(String s)
    {   
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        System.out.print(Arr);

    }     
        
}

class program17
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        obj.strUpr(str);

        
    }    
} 