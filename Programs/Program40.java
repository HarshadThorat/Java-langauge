// Write a Program which accept width & height of rectangle from user and calculate its area. 
// (Area =  Width * Height)
// Input : 5.3     9.78
// Output: 51.834

import java.util.*;
 
class Numbers
{
    public float Width;
    public float Height;

    public Numbers(float i, float j)
    {
        Width = i;
        Height = j;
    }

    public double RectangleArea()
    {
        double Area= 0.0;

        Area = Width * Height;
        return Area;
    }

}


class Program40
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Width");
        float No1 = sobj.nextFloat();

        System.out.println("Enter the Height");
        float No2 = sobj.nextFloat();

        Numbers obj = new Numbers(No1,No2);

        double ret = obj.RectangleArea();
        System.out.println("Area of Rectangle is : "+ret);
    }
}
