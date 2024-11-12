import java.util.Scanner;

class Employee {
    private String name, address;
    private int age;
    private long phoneNumber;
    private double salary;

    public double printSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Officer extends Employee {
    private String specialization, department;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getSpecialization() {
        return this.specialization;
    }
}

class Manager extends Employee {
    private String specialization, department;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getSpecialization() {
        return this.specialization;
    }
}

public class inheritence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Officer o = new Officer();
            Manager m = new Manager();

            System.out.println("Enter the officer details: \n");

            System.out.print("Name: ");
            o.setName(sc.nextLine());

            System.out.print("Address: ");
            o.setAddress(sc.nextLine());

            System.out.print("Age: ");
            o.setAge(sc.nextInt());

            System.out.print("Phone Number: ");
            o.setPhoneNumber(sc.nextLong());

            System.out.print("Salary: ");
            o.setSalary(sc.nextDouble());

            sc.nextLine();

            System.out.println("\n\nOfficer Details are: \n");

            System.out.println("Name: " + o.getName());
            System.out.println("Address: " + o.getAddress());
            System.out.println("Age: " + o.getAge());
            System.out.println("Phone Number: " + o.getPhoneNumber());
            System.out.println("Salary: " + o.printSalary());

            System.out.println("\n\nEnter the Manager details: \n");

            System.out.print("Name: ");
            m.setName(sc.nextLine());

            System.out.print("Address: ");
            m.setAddress(sc.nextLine());

            System.out.print("Age: ");
            m.setAge(sc.nextInt());

            System.out.print("Phone Number: ");
            m.setPhoneNumber(sc.nextLong());

            System.out.print("Salary: ");
            m.setSalary(sc.nextDouble());

            System.out.println("\n\nManager Details are: \n");

            System.out.println("Name: " + m.getName());
            System.out.println("Address: " + m.getAddress());
            System.out.println("Age: " + m.getAge());
            System.out.println("Phone Number: " + m.getPhoneNumber());
            System.out.println("Salary: " + m.printSalary());
        }
    }
}
