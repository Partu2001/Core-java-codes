package chapter2;
import java.util.Scanner;
public class Employee {
    int id;
    String name;
    float salary;
    String position;
    static int autoid = 100;  

    public Employee() {
    	
    }
  
    public Employee(String name, float salary, String position){
        this.id = autoid++;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String toString(){
        return id + "  " + name + "  " + salary + "  " + position;
    }

    public static void accept(Employee arr[]){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter Employee name:");
            String name = sc.next();

            System.out.println("Enter Employee salary:");
            float salary = sc.nextFloat();

            System.out.println("Enter Employee position:");
            String position = sc.next();

            arr[i] = new Employee(name, salary, position);
        }
        sc.close();
    }
    
    public static void display(Employee arr[]){
        System.out.println("Employee Details:");
        for(Employee e : arr){
            System.out.println(e);
        }
    }
}
