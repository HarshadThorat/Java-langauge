//write a java program which accept string from user and display it in reverse order
// input  :  MarvellouS
// output :  SuollevraM              


import java.util.*;

class Alphabate
{
    public void Reverse(String s)
    {
        char Arr[] = s.toCharArray();

        for(int i = Arr.length-1; i >= 0 ; i--)
        {
            System.out.print(Arr[i]);
        }
    }
}


class program30
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        Alphabate obj = new Alphabate();

        obj.Reverse(str);
 
        
        
    }
}