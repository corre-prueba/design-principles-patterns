package principles.abstraction.company2;

public class Programmer implements Employee
{
    public String doWork(String systemName) {
        return "Here's the code for: " + systemName + "\n";
    }
}
