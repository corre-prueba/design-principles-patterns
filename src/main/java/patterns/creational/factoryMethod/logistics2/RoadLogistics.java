package patterns.creational.factoryMethod.logistics2;

public class RoadLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Truck();
    }
}
