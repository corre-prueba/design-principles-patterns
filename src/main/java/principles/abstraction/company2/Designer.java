package principles.abstraction.company2;

public class Designer implements Employee
{
    public String doWork(String systemName) {
        return "Here's the architecture for: " + systemName + "\n";
    }
}
