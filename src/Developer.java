import java.util.SortedMap;

public class Developer extends Employee{
    private String grade;

    public Developer(String name, int age, int salary, String reason, String grade) {
        super(name, age, salary, reason);
        this.grade = grade;
    }

    public Developer() {

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    private void devCodes(){
        System.out.println("Я пишу код");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ранг: " + grade);
        devCodes();
    }

    @Override
    public void goToDayOff() {
        System.out.println("Причина отпуска: " + getReason());
    }
}
