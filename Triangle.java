
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    double[][] arr =new double[3][2];
    
    Triangle(double[][] arr)
    {
       this.arr=arr;
    }
    double getArea()
    {
        double area=Math.abs(((arr[0][0]*(arr[1][1]-arr[2][1]))+(arr[1][0]*(arr[2][1]-arr[0][1]))+(arr[2][0]*(arr[0][1]-arr[1][1])))/2);
        return area;
    }
    double getPerimeter()
    {
        double perimeter=Math.sqrt(Math.pow(arr[0][0]-arr[1][0],2)+Math.pow(arr[0][1]-arr[1][1],2))+
                         Math.sqrt(Math.pow(arr[1][0]-arr[2][0],2)+Math.pow(arr[1][1]-arr[2][1],2))+
                         Math.sqrt(Math.pow(arr[0][0]-arr[2][0],2)+Math.pow(arr[0][1]-arr[2][1],2));
        return perimeter;
    }
    boolean isRightAngleTriangle()
    {
        double side1=(Math.pow(arr[0][0]-arr[1][0],2)+Math.pow(arr[0][1]-arr[1][1],2));
        double side2=(Math.pow(arr[1][0]-arr[2][0],2)+Math.pow(arr[1][1]-arr[2][1],2));
        double side3=(Math.pow(arr[0][0]-arr[2][0],2)+Math.pow(arr[0][1]-arr[2][1],2));

        double maxside=side1;
        if(maxside<side2)
        {
            maxside=side2;
        }
        if(maxside<side3)
        {   
            maxside=side3;
        }
        return side1+side2+side3-2*maxside==0;
    }
    boolean isIsoscelesTriangle()
    {
        double side1=(Math.pow(arr[0][0]-arr[1][0],2)+Math.pow(arr[0][1]-arr[1][1],2));
        double side2=(Math.pow(arr[1][0]-arr[2][0],2)+Math.pow(arr[1][1]-arr[2][1],2));
        double side3=(Math.pow(arr[0][0]-arr[2][0],2)+Math.pow(arr[0][1]-arr[2][1],2));
        
        return ((side1==side2)||(side1==side3)||(side2==side3));
    }
    boolean isEquilateralTriangle()
    {
        double side1=(Math.pow(arr[0][0]-arr[1][0],2)+Math.pow(arr[0][1]-arr[1][1],2));
        double side2=(Math.pow(arr[1][0]-arr[2][0],2)+Math.pow(arr[1][1]-arr[2][1],2));
        double side3=(Math.pow(arr[0][0]-arr[2][0],2)+Math.pow(arr[0][1]-arr[2][1],2));
        
        return (side1==side2 && side2==side3);
    }
}
