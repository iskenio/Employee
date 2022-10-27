public abstract class Employee implements EmployeeService{
    private String name;
    private int age;
    private int salary;
    private String reason;

    public Employee(String name, int age, int salary, String reason) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.reason = reason;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void print(){
        System.out.println("Имя сотрудника: " + name + "\n" + "Зарик: " + salary + "\n"
                + "Возраст: " + age + "\n");
    }
    public abstract void goToDayOff();
}
