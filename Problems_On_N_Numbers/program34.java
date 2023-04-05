//write java program which accept marks of N student from user and display class of each student
//Input : 67.3   45.8   88.9    77.5    55.2  
//Outut :   67.5   first class
//          45.8    pass class 
//          89.9    first class with distinction
//          77.5    first class with distinction
//          55.2    second class 


import java.util.*;

class Number
{
    public void Percentage(float Arr[],int Size)
    {
        System.out.println("Marks are : ");
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            if(Arr[iCnt] < 35)
            {
                System.out.println(Arr[iCnt]+"\t"+"Fail");
            }
            else if((Arr[iCnt] > 35) && (Arr[iCnt] < 50))
            {
                System.out.println(Arr[iCnt]+"\t"+"Pass class");
            }
            else if((Arr[iCnt] > 50) && (Arr[iCnt] < 60))
            {
                System.out.println(Arr[iCnt]+"\t"+"Second class");
            }
            else if((Arr[iCnt] > 60) && (Arr[iCnt] < 70))
            {
                System.out.println(Arr[iCnt]+"\t"+"First class");
            }
            else 
            {
                System.out.println(Arr[iCnt]+"\t"+"First class with Distinction");
            }
        }
        
        
    } 
}


class program34
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of first Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        float Arr1[] = new float[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.nextFloat();
        }
  
        Number obj = new Number();
        obj.Percentage(Arr1,size1); 
    
    }
}
