package patterns.creational.factoryMethod.logistics2;

public class SeaLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Ship();
    }
}
