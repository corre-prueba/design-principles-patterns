package patterns.creational.factoryMethod.dialog;

public class WindowsDialog extends Dialog
{
    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }
}
