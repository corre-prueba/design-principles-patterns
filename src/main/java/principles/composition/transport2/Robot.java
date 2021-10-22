package principles.composition.transport2;

public class Robot implements Driver
{
    @Override
    public void navigate()
    {
        System.out.println("Automatically drive");
    }
}
