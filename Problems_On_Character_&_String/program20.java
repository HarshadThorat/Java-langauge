// Write a program which accept string from user and Count number of white spaces.
// input :  Marvellous        harsh ad  
// output :   0                1

import java.util.*;

class Alphabate
{
    public int CountWhiteSpaces(String s)
    {   
        int iCnt = 0;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ') 
            {
                iCnt++;
            }
        }
        return iCnt;
    }     
}


class program20
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        int ret = obj.CountWhiteSpaces(str);
        System.out.println("Number of white spaces are : "+ret);
        
        
    }    
} 