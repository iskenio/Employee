public class Manager extends Employee{
    private boolean hasStocks;

    public Manager(String name, int age, int salary, String reason, boolean hasStocks) {
        super(name, age, salary, reason);
        this.hasStocks = hasStocks;
    }

    public Manager() {

    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public boolean getHasStonks(){
        return hasStocks;
    }
    private void writeProcedures(){
        System.out.println("я пишу процедуры!");
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Акции: " + hasStocks);
        writeProcedures();
    }

    @Override
    public void goToDayOff() {
        System.out.println("Причина отпуска: " + getReason());
    }

    @Override
    public void goToVacation() {
        System.out.println("I'm " + getName() + " going to IK");
    }
}

