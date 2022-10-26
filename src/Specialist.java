public class Specialist extends Employee{
    private int level;

    public Specialist(String name, int age, int salary, int level, String reason) {
        super(name, age, salary, reason);
        this.level = level;
    }

    public Specialist() {

    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
    private void specTalks(){
        System.out.println("Какой нудный клиент попался!");
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Уровень: " + level);
        specTalks();
    }

    @Override
    public void goToDayOff() {
        System.out.println("Причина отпуска: " + getReason());
    }
}
