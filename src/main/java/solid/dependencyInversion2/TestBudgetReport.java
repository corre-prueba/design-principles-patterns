package solid.dependencyInversion2;

public class TestBudgetReport
{
    public static void main(String[] args) {
        BudgetReport budgetReport = new BudgetReport();
        budgetReport.save();
    }
}
