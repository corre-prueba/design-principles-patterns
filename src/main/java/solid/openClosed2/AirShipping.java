package solid.openClosed2;

public class AirShipping implements Shipping
{
    @Override
    public double getCost(Order order)
    {
        return Double.max(20, order.getTotalWeight() * 3);
    }
}
