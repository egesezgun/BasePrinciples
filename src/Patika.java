package src;

public class Patika {
    public static void main(String[] args){
    Employee e1 = new Employee("Ege Sezgün", "0500000040","ege@ege.tr");
    System.out.println(e1.getNameSurname());
    e1.entry();
    Academician a1 = new Academician("Oguz Hoca", "456787654", "ou@gmail.com", "Elektronik", "Bölüm başkanı");
    a1.exit();
    a1.classEntry();
    Employee m1 = new Officer("Ali Bey", "4565432456654","epos@gdd.com","bilgi işlemci","09:00");
    m1.diningRoom();
    }
}
