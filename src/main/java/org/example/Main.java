package org.example;

import org.example.Sorting.SelectionSort;
import org.example.generalization.Employee;
import org.example.generalization.GeneralMax;

public class Main {
    public static void main(String[] args) {
        /*IntList intList = new IntList(5);
        intList.addLast(10);
        intList.addLast(15);
        System.out.println(intList);
        System.out.println(intList.size());*/

       int[] numbers = new int[]{5, 1, 7, 12, -2, 0};
       SelectionSort.selectionSort(numbers);
       SelectionSort.testSelectionSort(numbers, new int[] {-2, 0, 1, 5, 7, 12});

        Employee[] emps = new Employee[]{new Employee(10, "Ali"),
                                         new Employee(100, "Mohamed"),
                                         new Employee(1000, "Asmaa")
        };
        //GeneralMax.OurComparableMax(emps);


        Employee maxEmployee = (Employee) GeneralMax.ComparableMax(emps);
        Employee maxEmployeeHoF = GeneralMax.hoFMax(emps, (emp1, emp2) ->
                emp1.getSalary() - emp2.getSalary());

        System.out.println(maxEmployeeHoF.getSalary());

        Employee maxEmployeeComparator = GeneralMax.comparatorMax(emps, Employee.getNameComparator());
        System.out.println(maxEmployeeComparator.getName());
    }
}