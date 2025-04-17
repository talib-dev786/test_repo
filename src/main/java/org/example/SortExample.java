package org.example;

import org.example.Domain.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//public class SortExample {

//    public static void main(String args[]){
        //Sort listof string in asc order
//        List<String> fruits = new ArrayList<>();
//        fruits.add("mango");
//        fruits.add("watermelon");
//        fruits.add("apple");

//        fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//
//        using lambda expression
//        fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

        //Sort listof string in desc order

//        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //        using lambda expression
//        fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

/* -------------------------------------------------------------------------------------------------------------------------------*/
        // sort emp accroding to salary in asc order

//List<Employee> empList =  new ArrayList<>();
//empList.add(new Employee(12,"ram",45,450000));
//empList.add(new Employee(12,"shyam",25,350000));
//empList.add(new Employee(12,"ajay",55,550000));
//empList.add(new Employee(12,"vijay",35,370000));

//sort in asc using lambda
//empList.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);

//sort in desc using lambda
//empList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).forEach(System.out::println);

        //Sort in asc using comparator
//        empList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);

        //Sort in desc using comparator
//        empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);

/* -------------------------------------------------------------------------------------------------------------------------------*/
        // sort emp accroding to age in asc order

        //Sort in asc using comparator
//        empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        //Sort in desc using comparator
//        empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

        /* -------------------------------------------------------------------------------------------------------------------------------*/
        // sort emp accroding to name in asc order

        //Sort in asc using comparator
//        empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        //Sort in desc using comparator
//        empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

//    }
//}
