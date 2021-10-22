package principles.composition.transport2;

public class Human implements Driver
{
    @Override
    public void navigate()
    {
        System.out.println("Drive");
    }
}
