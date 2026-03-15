package Threads_Concepts.Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamsTerminalOperation {
    public static void main(String[] args) {
        
        List<Integer> list=List.of(1,2,3,4,5,6);

        // forEach is like a consumer used to consume the elements in the stream and return void
        System.out.println("Foreach termial operator");
        list.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);


        //Collect is like a collector used to collect the elements in the stream and return a collection
        System.out.println("Collect termial operator");
        List<Integer> evenNumbers=list.stream()
        .filter(n->n%2==0)
        .map(n->n*n)
        .collect(Collectors.toList());

        System.out.println("Even Numbers:"+evenNumbers);


        // count is like a counter used to count the number of elements in the stream and return a long value
        System.out.println("Count termial operator");
        long count=list.stream()
        .filter(n->n%2==0)
        .count();
        System.out.println("Count of Even Numbers:"+count);

        //groupingBy is like a grouper used to group the elements in the stream and return a map
        System.out.println("GroupingBy termial operator");

        List<Employee> employees=List.of(
            new Employee("John","IT",30),
            new Employee("Jane","HR",25),
            new Employee("Bob","IT",35),
            new Employee("Alice","HR",28)); 
        var groupByDepartment=employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Group By Department:"+groupByDepartment);

        //partitioningBy is like a partitioner used to partition the elements in the stream and return a map
        System.out.println("PartitioningBy termial operator");
        var partitionByAge=employees.stream()
        .collect(Collectors.partitioningBy(emp -> emp.getAge()>29));

        System.out.println("Partition By Age:"+partitionByAge);


        //minBy is like a min used to find the minimum element in the stream and return an optional
        System.out.println("MinBy termial operator");
        var minAge=employees.stream()
        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Min Age:"+minAge);

        //maxBy is like a max used to find the maximum element in the stream and return an optional
        System.out.println("MaxBy termial operator");
        var maxAge=employees.stream()
        .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Max Age:"+maxAge);
    }
}

class Employee
{
    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
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
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
