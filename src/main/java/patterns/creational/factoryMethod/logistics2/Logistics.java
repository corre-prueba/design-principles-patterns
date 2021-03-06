package patterns.creational.factoryMethod.logistics2;

public abstract class Logistics
{
    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Setting the plan."); ////
        transport.deliver();
    }

    public abstract Transport createTransport();
}
