package Collections.Comparisons;
/*Employee class here is acting as an utility class for String and Integer*/
public class Employee implements Comparable {
    private String name;
    private Integer empID;
    private String department;

    public Employee(String name, Integer empID, String department) {
        this.name = name;
        this.empID = empID;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return this.name.compareTo(employee.name);
//        return this.empID.compareTo(employee.empID);
    }
}
