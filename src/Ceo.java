public class Ceo extends Manager{
    private boolean hasCompanyCar;

    public Ceo(String name, int age, int salary, boolean hasStocks, String reason, boolean hasCompanyCar) {
        super(name, age, salary, reason, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public Ceo() {

    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    private void goPublic(){
        System.out.println("я пишу ИПО");
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Есть машина: " + hasCompanyCar);
    }

    @Override
    public void goToDayOff() {
        super.goToDayOff();
    }

}
