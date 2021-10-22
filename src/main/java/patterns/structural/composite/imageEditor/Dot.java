package patterns.structural.composite.imageEditor;

public class Dot implements Graphic
{
    private int x;
    private int y;

    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y)
    {
        System.out.println("Moving dot by " + "(" + x + ", " + y + ")");
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw()
    {
        System.out.println("Painting dot at " + "(" + x + ", " + y + ")");
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
