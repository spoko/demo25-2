package poly;

public class Test {
    public static void main(String[] args) {
        QualityAssuranceEmp qa1 = new QualityAssuranceEmp("Ivan", "01.04.2025",
                1500, "Engineering", 25, true);

        DeveloperEmp dev1 = new DeveloperEmp("Petar", "01.05.2022",
                1500, "Engineering", 30, new String[]{"Java", "C#"});

        //we cannot have an object from an abstract class
        //Employee employee = new Employee();

        qa1.doWork();
        qa1.getPayCheck();
        qa1.getBonus();

        dev1.doWork();
        dev1.getPayCheck();
        dev1.getBonus();
    }
}
