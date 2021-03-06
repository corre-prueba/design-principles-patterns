package patterns.creational.builder.house;

public class House
{
    private int windows;
    private int doors;
    private int rooms;

    public int getWindows()
    {
        return windows;
    }

    public void setWindows(int windows)
    {
        this.windows = windows;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public int getRooms()
    {
        return rooms;
    }

    public void setRooms(int rooms)
    {
        this.rooms = rooms;
    }

    @Override
    public String toString()
    {
        return "Generic House{" +
               "windows=" + windows +
               ", doors=" + doors +
               ", rooms=" + rooms +
               '}';
    }
}
