package patterns.creational.factoryMethod.dialog;

public class HTMLDialog extends Dialog
{
    @Override
    public Button createButton()
    {
        return new HTMLButton();
    }
}
