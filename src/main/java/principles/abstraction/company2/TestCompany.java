package principles.abstraction.company2;

public class TestCompany
{
    public static void main(String[] args) {
        Company company = new Company("A tu medida");
        System.out.println(company.createSoftware("Nomina"));
    }
}
