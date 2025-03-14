
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    double radius;
   double centerX;
   double centerY;
   Circle(double r,double X,double Y)
   {
        radius=r;
        centerX=X;
        centerY=Y;
    }
    double getArea()
    {
        return Math.PI*(Math.pow(radius,2));
    }
    double getPerimeter()
    {   
        return  Math.PI*2*radius;
    }
    boolean isPointInside(double x,double y)
    {
        return Math.sqrt((Math.pow(centerX-x,2))+(Math.pow(centerY-y,2)))<=radius;
    }
}
