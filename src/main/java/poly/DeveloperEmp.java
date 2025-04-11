package poly;

public class DeveloperEmp extends Employee{
    private String[] programingLanguages;

    public String[] getProgramingLanguages() {
        return programingLanguages;
    }

    public void setProgramingLanguages(String[] programingLanguages) {
        if (!programingLanguages.equals(null)){
            this.programingLanguages = programingLanguages;
        }else {
            System.out.println("Error: invalid array of programing languages");
        }
    }

    public DeveloperEmp(String name, String startDate, double salary, String department,
                        int age, String[] programingLanguages) {
        super(name, startDate, salary, department, age);
        setProgramingLanguages(programingLanguages);
    }

    @Override
    public void doWork() {
        System.out.printf("%s is writing code...\n", getName());
    }

    @Override
    public void askQuestions() {

    }

    @Override
    public void receiveFeedback() {

    }

    @Override
    public void supportSomeone() {

    }

    @Override
    public void giveFeedback() {

    }
}
