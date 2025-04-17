//package org.example;
//
//import org.example.Domain.EmpDto;
//import org.example.Domain.Employee;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Function;
//
//public class MapCollect {
//
//    public static  void main(String args[]) {
//        //before java 8
//
//        List<String> listObj = Arrays.asList("a", "b", "c", "d");
//        List<Integer> tableObj = Arrays.asList(1,2,3,4);
////
////        List<String> listUpper = new ArrayList<>();
////
////        for (String strObj : listObj){
////            listUpper.add(strObj.toUpperCase());
////        }
////        System.out.println(listUpper);
//
//        //with java 8
////        listObj.stream().map(String::toUpperCase).forEach(System.out::println);
//
////        tableObj.stream().map(x-> x*2).forEach(System.out::println);
//
//        /*----------------------Map entity to Jpa using stream.map()--------------------------------------*/
//
//        List<Employee> empObj =  new ArrayList();
//        empObj.add(new Employee(1,"Ramesh",24,35000));
//        empObj.add(new Employee(2,"Ajay",23,45000));
//        empObj.add(new Employee(3,"Suresh",45,100000));
//        empObj.add(new Employee(4,"Vijay",35,980000));
//
//        //using functional interface
////        empObj.stream().map(new Function<Employee, EmpDto>() {
////            @Override
////            public EmpDto apply(Employee employee) {
////                return new EmpDto(employee.getId(),employee.getName(),employee.getAge());
////            }
////        });
//
//    //using lambda expression
//
////        empObj.stream().map((Employee employee)->
////                  new EmpDto(employee.getId(),employee.getName(),employee.getAge()))
////                .forEach((empDto ->
////                {
////                    System.out.println(empDto);
////                }));
//
//    }
//
//}
