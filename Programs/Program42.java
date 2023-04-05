// Write a Program which accept temperature in Fahrenheit and convert it into celsius.
// (1 celsius = (Fahrenheit -32) * (5/9))
// Input :   10 
// Output: -12.2222     (10-32) * (5/9)


import java.util.*;
 
class Numbers
{
    public int temp;

    public Numbers(int i)
    {
        temp = i;
    }

    public double FhTOCs()
    {
        double Ans = 0.0;

        Ans = (temp - 32) * (5/9);
        return Ans;
    }

}


class Program42
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit");
        int No1 = sobj.nextInt();

        Numbers obj = new Numbers(No1);

        double ret = obj.FhTOCs();
        System.out.println("Celcius of the temperature is : "+ret);
    }
}
