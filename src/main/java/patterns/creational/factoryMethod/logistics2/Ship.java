package patterns.creational.factoryMethod.logistics2;

public class Ship implements Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by sea in a container.");
    }
}
