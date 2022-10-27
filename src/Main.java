public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setName("Искендер");
        dev.setAge(25);
        dev.setSalary(140000);
        dev.setGrade("Senior");
        dev.setReason("Вылет за границу");
        dev.goToDayOff();
        dev.print();
    //    dev.goToVacation();
        System.out.println("--------------------------------------");
        Developer dev2 = new Developer();
        dev2.setName("Иван");
        dev2.setAge(15);
        dev2.setSalary(90000);
        dev2.setGrade("Middle");
        dev2.setReason("Свадьба друга");
        dev2.goToDayOff();
        dev2.print();
    //    dev2.goToVacation();
        System.out.println("--------------------------------------");
        Developer dev3 = new Developer();
        dev3.setName("Борис");
        dev3.setAge(20);
        dev3.setSalary(40000);
        dev3.setGrade("Junior");
        dev3.setReason("Нужно домой");
        dev3.goToDayOff();
        dev3.print();
    //    dev3.goToVacation();
        System.out.println("--------------------------------------");
        Developer dev4 = new Developer();
        dev4.setName("Ахмеджан");
        dev4.setAge(19);
        dev4.setSalary(10000);
        dev4.setGrade("Intern");
        dev4.setReason("Экзамен в унике");
        dev4.goToVacation();
        dev4.print();
    //    dev4.goToDayOff();
        System.out.println("--------------------------------------");
        Specialist spec1 = new Specialist("Талгат", 25, 59999, 25, "Эмоциональное выгорание");
        spec1.print();
        spec1.goToDayOff();
    //    spec1.goToVacation();
        System.out.println("--------------------------------------");
        Specialist spec2 = new Specialist("Талгарт", 35, 89000, 16, "Эмоциональное выгорание");
        spec2.print();
        spec2.goToDayOff();
      //  spec2.goToVacation();
        System.out.println("--------------------------------------");
        Specialist spec3 = new Specialist("Талант", 59, 54000, 11, "Эмоциональное выгорание");
        spec3.print();
        spec3.goToDayOff();
       // spec3.goToVacation();
        System.out.println("--------------------------------------");
        Manager man1 = new Manager();
        man1.setName("Бакыт");
        man1.setAge(19);
        man1.setSalary(25010);
        man1.setHasStocks(false);
        man1.setReason("Some reason");
        man1.print();
        man1.goToDayOff();
       // man1.goToVacation();
        System.out.println("--------------------------------------");
        Manager man2 = new Manager();
        man2.setName("Нуралы");
        man2.setAge(21);
        man2.setSalary(35010);
        man2.setHasStocks(true);
        man2.setReason("Another reason");
        man2.print();
        man2.goToDayOff();
      //  man2.goToVacation();
        System.out.println("--------------------------------------");
        Ceo ceo = new Ceo();
        ceo.setName("Асем");
        ceo.setAge(21);
        ceo.setSalary(50000);
        ceo.setHasStocks(true);
        ceo.setHasCompanyCar(true);
        ceo.setReason("Работала без выходных 2 года");
        ceo.print();
        ceo.goToDayOff();
        //ceo.goToVacation();
        System.out.println("--------------------------------------");

        Employee[] empArr = {dev, dev2, dev3, dev4, spec1, spec2, spec3, man1, man2, ceo};
        System.out.println("В честь дня рождения комании все сотрудники уходят в отпуск!");
        for (int i = 0; i < empArr.length; i++){
            empArr[i].goToVacation();
        }
//        Specialist[] specArr = {spec1, spec2, spec3};
//        Manager[] manArr = {man1, man2};





    }
}