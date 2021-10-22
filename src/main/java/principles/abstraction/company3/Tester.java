package principles.abstraction.company3;

public class Tester implements Employee
{
    public String doWork(String systemName) {
        return "Tested: " + systemName + "\n";
    }
}
