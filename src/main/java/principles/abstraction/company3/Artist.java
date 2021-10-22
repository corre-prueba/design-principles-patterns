package principles.abstraction.company3;

public class Artist implements Employee
{
    public String doWork(String systemName) {
        return "Here's the art work for: " + systemName + "\n";
    }
}
