package poly;

public class QualityAssuranceEmp extends Employee{
    private boolean hasISTQB;

    public QualityAssuranceEmp(String name, String startDate, double salary, String department,
                               int age, boolean hasISTQB) {
        super(name, startDate, salary, department, age);
        this.hasISTQB = hasISTQB;
    }

    @Override
    public void doWork() {
        System.out.printf("%s is writing test cases and exploring for bugs/ problems\n", getName());
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

    //we cannot override a final method
//    public void getBonus(){
//        if (hasISTQB){
//            System.out.printf("%s is getting 1000 BGN bonus\n", getName());
//        }else {
//            System.out.printf("%s is getting 500 BGN bonus\n", getName());
//        }
//    }
}
