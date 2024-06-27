package Mar14;

public class LandTract
{
    private double length, width, area;

    public LandTract(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double getArea()
    {
        area = length * width;
        return area;
    }
    public boolean equals(LandTract landTract)
    {
        return this.getArea() ==landTract.getArea();
    }
    public String toString()
    {
        return "LandTract{Length = " + length + ", width = " + width +"}";
    }
}
