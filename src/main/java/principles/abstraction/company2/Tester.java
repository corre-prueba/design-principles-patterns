package principles.abstraction.company2;

public class Tester implements Employee
{
   public String doWork(String systemName) {
        return "Tested: " + systemName + "\n";
    }
}
