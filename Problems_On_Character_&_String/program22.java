// write a program which accept string from user and accept one character. return frequency of that character.
// input : Marvellous   Multi OS
// output : (M)  2    

import java.util.*;

class Alphabate
{
    public int CheckFrequency(String s,char ch)
    {   
        int iCnt = 0;

        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch) 
            {
                iCnt++;
            }
        }
        return iCnt;
    }     
}


class program22
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        int ret = obj.CheckFrequency(str,ch);
        System.out.println("Frequency of : "+ch+" is : "+ret);
        
    }    
} 