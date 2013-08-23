// A landscape designer needs a program to make calculations in meters about a 
// front yard given its width and length in feet. 
// Write a class YardCalculator with a constructor that takes the width and 
// length in feet as parameters:
// public YardCalculator(double theLength, double theWidth)

// Provide methods: 

//   public double perimeter() which returns the perimeter in meters
//   public double area() which returns the area in square meters
//   public double diagonal() which returns the diagonal in meters

// 1 foot = 0.3048 meters.


// Define and use a constant for the conversion factor. Define it in the class
// itself, outside any method, so all the methods can use it.

// public static  final double METERS_PER_FOOT = 0.3048;

public class YardCalculator
{
    //instance variables here
    private double lengthInMeters;
    private double widthInMeters;
    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard
     * @param theWidth the width of the yard
     */
    public YardCalculator(double theLength, double theWidth)
    {
         lengthInMeters = theLength * 0.3048;
         widthInMeters = theWidth * 0.3048;
    }

    // returns the perimeter in meters
    public double perimeter()
    {
         return (2 * lengthInMeters) + (2 * widthInMeters) ;
    }

    // returns the area in square meters
    public double area()
    {
         return lengthInMeters * widthInMeters;
    }

    // returns the diagonal in meters
    public double diagonal()
    {
    	return Math.sqrt(Math.pow(lengthInMeters, 2) + Math.pow(widthInMeters, 2));
    }

}