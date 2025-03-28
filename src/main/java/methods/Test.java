package methods;

public class Test {
    public static void main(String[] args) {
        Student pesho = new Student("Petar", "KST", 10001);
        System.out.println(pesho);

        pesho.setName("Ivan");
        System.out.println(pesho);

        //pesho.setFacultyNumber(10007);//not possible, not a real life scenario
        System.out.println(pesho);

        pesho.selectSportDay(WeekDays.TUE);

        System.out.println(average(2, 5));
        System.out.println(average(average(5, 34), average(4, 34)));
    }

    public static int average(int a, int b){
        return (a + b) / 2;
    }
}
