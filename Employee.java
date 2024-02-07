public class Employee {
    float salary=50000;
    Employee(){ System.out.println("PARENT");
    }
    
}
class Programmer extends Employee{
    Programmer(int age){
        System.out.println("CHILD");
    }
    int bonus =15000;
    public static void main(String[] args) {
        int age=27;
        Programmer p=new Programmer(age);
       // display();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus : "+p.bonus);

    }
}
