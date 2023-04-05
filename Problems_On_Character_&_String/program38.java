//write java program which accept  arrays  from user and Display below pattern
//Input :  8   9  7  6  4   2   4
//Outut :  * * * * * * * *
//         * * * * * * * * *
//         * * * * * * *         
//         * * * * * *
//         * * * *
//         * *  
//         * * * * 



import java.util.*;

class Pattern
{
    public void Display(int Arr[],int Size)
    {
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            for(int j = 0; j < Arr[iCnt]; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }      
    } 
}


class program38
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of character Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        int Arr1[] = new int[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.nextInt();
        }

        Pattern obj = new Pattern();
        obj.Display(Arr1,size1);
        
    }
}