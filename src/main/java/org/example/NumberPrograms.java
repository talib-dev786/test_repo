package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberPrograms {

    public static void main(String args[]) throws IOException {
// factorial
//        Integer num =5;
////        Long fact = factorialRec(num);
//        Long factWithOut = fact(num);
////        System.out.println("factorial of the num is :" +factorialRec);
//        System.out.println("factorial of the num is :" +factWithOut);
//
//    }
//
//    private static Long fact(Integer num) {
//
//        long factorial = 1;
//        for(int i =1 ;i<=num;i++){
//            factorial = factorial*i;
//        }
//        return factorial;
//    }

//    private static Long factorialRec(Integer num) {
//
//        if(num ==0 || num ==1){
//            return 1;
//        }
//        else{
//            return num*factorial(num-1);
//        }

        /*--------------sum of n natural nos------------------*/

//        System.out.println("Enter the number where u want sum till:");
////        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        long n = Long.parseLong(br.readLine());
//        long sum = n*(n+1)/2;
//        System.out.println("sum of n natural nos is:"+sum);

        /*------------------------------Reverse a no---------------------------------*/

//        System.out.println("Enter the no for reverse and palindrome:");
//        Scanner sc =new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String originalNo = br.readLine();
//        String neww= new StringBuilder(originalNo).reverse().toString();
//        int temp = originalNo;
//        int reverseNo=0;
//
//        String strValue = new StringBuilder(String.valueOf(originalNo)).reverse().toString();
//
//        while(originalNo!=0){
//
//            int lastDigit = originalNo%10;// extract last digit
//            reverseNo = reverseNo *10 +lastDigit; //append last digit
//            originalNo =originalNo/10; //get the remaining original no
//
//        }
//        System.out.println("Reverse no is:"+neww);
//
//        if(temp == reverseNo){
//            System.out.println(temp +" is a palindrome no");
//        }
//        else{
//            System.out.println(temp +" is not a palindrome no");
//
//        }
//
        /*------------------------------odd and even no and table---------------------------------*/

//        System.out.println("Enter a no:");

//        List<Integer> ls = Arrays.asList(12,56,78,90,34,67,889,334,56,71,23,43,42);
//        Scanner sc = new Scanner(System.in);
//        int upperLimit = sc.nextInt();
//        List<Integer> evenList = new ArrayList<>();
//        List<Integer> mulList = new ArrayList<>();

//        for(int i =1;i<=upperLimit;i++){
//            if(i%2 == 0){
//                evenList.add(i);
//            }
//        }
//        List<Integer> evenList = IntStream.range(1,upperLimit)
//                .filter(x-> x%2 ==0)
//                .boxed()
//                .toList();
//        List<Integer> evenList = ls.stream()
//                .filter(x->x%2 == 0).toList();
//
//        List<Integer> mulList = IntStream.range(1,11).
//                map(i-> i*upperLimit)
//                .boxed().toList();
//
//        List<Integer> oddList= IntStream.range(1,upperLimit)
//                .filter(x-> x%2 !=0)
//                        .boxed().toList();
//
//        System.out.println("Even nos:"+evenList);
//        System.out.println("odd nos:"+oddList);
//        System.out.println("Table is:"+mulList);

        /*------------------------------Fibo series----------------------------------*/
//        long first =0;
//        long second =1;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a no:");
//        long limit = sc.nextLong();
//        System.out.println("Fibonacci Series up to " + limit + " limit:");
//        for(int i =1;i<=limit;i++){
//        System.out.print(first + " ");
//            long next = first+second;
//            first=second;
//            second=next;
//        }
        /*------------------------------------Prime nos------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the upper Limit");
//
//        int num = sc.nextInt();
//        System.out.println("Prime numbers between 1 and " + num + " are:");
//
//
//        for(int i = 1;i<=num;i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }
//
//    private static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

      /*-----------------------perfect Square------------*/

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no:");
//        int num = sc.nextInt();
//        double sqrt = Math.sqrt(num);
//        if((int)sqrt * (int)sqrt == num){
//            System.out.println("perfect square");
//        }
//        else {
//            System.out.println("not a perfect square");
//        }

        /*-------------------------------------------*/
        System.out.println("hello world");

    }
}
