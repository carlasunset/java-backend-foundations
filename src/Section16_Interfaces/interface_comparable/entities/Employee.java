package Section16_Interfaces.interface_comparable.entities;

// Employee implements Comparable<Employee>
// This allows Employee objects to be compared and sorted naturally
// The comparison logic is defined in the compareTo method
public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        // Compares employees based on salary
        // Uses Double (wrapper class) to access compareTo method
        return salary.compareTo(other.getSalary());
    }
    // Note:
    // If salary were a primitive type (double),
    // it would not be possible to call compareTo()
}
