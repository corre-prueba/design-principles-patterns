package patterns.structural.composite.imageEditor;

public class Circle extends Dot
{
    private int radius;

    public Circle(int x, int y, int radius)
    {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Painting circle of " + radius + " at " + "(" + this.getX() + ", " + this.getY() + ")");
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}
