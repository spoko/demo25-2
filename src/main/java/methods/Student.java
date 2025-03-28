package methods;

public class Student {
    //characteristics
    private int facultyNumber;
    private String name;
    private String subject;

    //setters and getters
    public int getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(int facultyNumber) {
        if (facultyNumber >= 10000){
            this.facultyNumber = facultyNumber;
        }else {
            System.out.println("Error: Invalid faculty number!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid name!");
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (!subject.isEmpty()){
            this.subject = subject;
        }else {
            System.out.println("Error: Invalid name!");
        }
    }

    //constructors
    //type - I
    public Student(){
        this.name = "Unknown";
        this.facultyNumber = 999999999;
        this.subject = "Not decided yet";
    }

    //type - II
    public Student(String name, String subject, int facultyNumber){
        setName(name);
        setFacultyNumber(facultyNumber);
        setSubject(subject);
    }

    public Student(int facultyNumber){
        setFacultyNumber(facultyNumber);
    }

    //type III - copy
    public Student(Student student){
        this.name = student.name;
        this.subject = student.subject;
        this.facultyNumber = student.facultyNumber;
    }

    //methods i.e. actions
    public String takeExam(boolean taken){
        //local variable
        String result;
        if (taken){
            result = "Successfully taken the exam!";
        }else {
            result = "I am sad/ mad!";
        }
        return result;
    }

    public int getNumberOfSubjects(int numberOfMandatorySubjects){
        return numberOfMandatorySubjects + 2;//SIP/ZIP = 2
    }

    public int getNumberOfSubjects(){
        return (5 + 2);
    }

    public void selectSportDay(WeekDays day){
        switch (day){
            case MON -> System.out.println("You will be sporting in Monday");
            case TUE -> System.out.println("You will be sporting in Tuesday");
            case WED -> System.out.println("You will be sporting in Wednesday");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyNumber=" + facultyNumber +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
