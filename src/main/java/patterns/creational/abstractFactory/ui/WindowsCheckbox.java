package patterns.creational.abstractFactory.ui;

public class WindowsCheckbox implements Checkbox
{
    @Override
    public void render()
    {
        System.out.println("Rendering a windows checkbox.");
    }
}
