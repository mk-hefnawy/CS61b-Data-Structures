package org.example.generalization;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    /*@Override
    public int compareTo(Object other) {
        Employee otherEmployee = (Employee) other; // couuld result in runtime cast exception

        return this.salary - otherEmployee.salary;
    }*/


    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }

    private static class NameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static Comparator<Employee> getNameComparator(){
        return new NameComparator();
    }
}
