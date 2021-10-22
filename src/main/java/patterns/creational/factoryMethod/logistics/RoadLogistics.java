package patterns.creational.factoryMethod.logistics;

public class RoadLogistics extends Logistics
{
    public void planDelivery() {
            Truck truck = new Truck();
            System.out.println("Setting the plan.");
            truck.deliver();
}
}
