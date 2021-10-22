package principles.abstraction.company2;

import java.util.ArrayList;

public class Company
{
    private String name;

    public Company(String name)
    {
        this.name = name;
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());

        for (Employee employee: employees) {
            system.append(employee.doWork(systemName));
        }

        return system.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
