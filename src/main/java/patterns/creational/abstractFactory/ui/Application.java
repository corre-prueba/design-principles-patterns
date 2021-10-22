package patterns.creational.abstractFactory.ui;

import java.util.Scanner;

public class Application
{
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public void createUI() {
        this.checkbox = guiFactory.createCheckbox();
        this.button = guiFactory.createButton();
    }

    public void render() {
        checkbox.render();
        button.render();
    }

    public void initialize(String operatingEnvironment) throws Exception {
        if (operatingEnvironment.equals("mac")) {
            guiFactory = new MacFactory();
        }
        else if (operatingEnvironment.equals("windows")) {
            guiFactory = new WindowsFactory();
        }
        else {
            throw new Exception("Unsupported operating environment.");
        }
    }

    public void main(String operatingEnvironment) throws Exception {
        this.initialize(operatingEnvironment);
        this.createUI();
        this.render();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Identificando entorno de ejecucion(mac/windows): ");
        String operatingEnvironment = scanner.next();

        Application application = new Application();

        try
        {
            application.main(operatingEnvironment);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
