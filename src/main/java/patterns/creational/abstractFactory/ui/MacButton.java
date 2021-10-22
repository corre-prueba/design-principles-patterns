package patterns.creational.abstractFactory.ui;

public class MacButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Rendering a mac button.");
    }
}
