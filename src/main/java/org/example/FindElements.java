//package org.example;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class FindElements {
//    public static void main(String args[]) {
//        List<Integer> listObj = Arrays.asList(1,2,4,5,77,45,332,66,987);
//
//        //find first and find any
//
////    Optional<Integer> firstObj = listObj.stream().findFirst();
////    if(firstObj.isPresent()){
////        System.out.println("stream is:"+firstObj.get());
////    }
////    else {
////        System.out.println("stream is empty");
////    }
//
////        long count = listObj.size();
////
////        int min = listObj.stream()
////                    .min(Integer::compareTo).orElseThrow(()-> new RuntimeException("EMPTY LIST"));
////
////        int max = listObj.stream()
////                .max(Integer::compareTo).orElseThrow(()-> new RuntimeException("EMPTY LIST"));
////
////        double avg = listObj.stream()
////                .mapToInt(Integer ::intValue)
////                .average().orElse(0.0);
////
////        int sum = listObj.stream()
////                .mapToInt(Integer::intValue)
////                .sum();
////
////
////        System.out.println("count:"+count);
////        System.out.println("sum:"+sum);
////        System.out.println("average:"+avg);
////        System.out.println("min:"+min);
////        System.out.println("max:"+max);
//
//
//        //////////now to print value and index
//
////        Map<Integer,Integer> values = IntStream.range(0,listObj.size())
////                .boxed().collect(Collectors.toMap(i->i,listObj::get));
////
////        System.out.println(values);
//
//
//        /// /to find whether element is present at which index
//        int target = 1;
//        OptionalInt val = IntStream.range(0, listObj.size())
//                .filter(i-> listObj.get(i) == target)
//                .findFirst();
//
//        if(val.isPresent()){
//            System.out.println("element is present at:"+val.getAsInt());
//        }
//        else {
//            System.out.println("element not present");
//        }
//
//    }
//}
