package patterns.creational.factoryMethod.dialog;

import java.util.Scanner;

public class Application
{
    private Dialog dialog;

    public void initialize(String operatingEnvironment) throws Exception {
        if (operatingEnvironment.equals("browser")) {
            dialog = new HTMLDialog();
        }
        else if (operatingEnvironment.equals("windows")) {
            dialog = new WindowsDialog();
        }
        else {
            throw new Exception("Unsupported operating environment.");
        }
    }

    public void main(String operatingEnvironment) throws Exception {
        this.initialize(operatingEnvironment);
        dialog.render();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Identificando entorno de ejecucion(browser/windows): ");
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
