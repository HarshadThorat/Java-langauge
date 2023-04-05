//write java program which accept  arrays from user and Reverse each number of that array 
//Input : 12  57  28  3 
//        

//Outut :  3 28 57 12 
//          


import java.util.*;

class Number
{
    public void Reverse(int Arr[],int Size)
    {
        int start = 0;
        int end = Size-1;
        int temp = 0;

        while(start < end)
        {
            temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }
       
       System.out.println("Array after the Reverse operation : "); 
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }        
    } 
        
}


class program31
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of first Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        int Arr1[] = new int[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.nextInt();
        }

        Number obj = new Number();
        obj.Reverse(Arr1,size1);


    }
}
