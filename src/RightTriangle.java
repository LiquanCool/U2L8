public class RightTriangle
{
    double base, height;

    public RightTriangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    /* Uses the Pythagorean Theorem: a^2 + b^2 = c^2
       to calculate and return the length of the hypotenuse (side c)
       of a right triangle with base (side a) and height (side b)
     */
    public double hypotenuse()
    {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}

