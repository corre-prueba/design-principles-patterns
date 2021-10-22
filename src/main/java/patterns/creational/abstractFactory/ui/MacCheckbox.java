package patterns.creational.abstractFactory.ui;

public class MacCheckbox implements Checkbox
{
    @Override
    public void render()
    {
        System.out.println("Rendering a mac checkbox.");
    }
}
