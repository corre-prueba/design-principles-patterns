package solid.singleResponsibility;

public class TestEmployee2
{
    public static void main(String[] args) {
        Employee2 lola = new Employee2("Lola");
        TimeSheetReport timeSheetReport = new TimeSheetReport();
        timeSheetReport.print(lola);
    }
}
