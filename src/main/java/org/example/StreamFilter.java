//package org.example;
//
//
//import org.example.Domain.Product;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StreamFilter {
//
//    public static void main(String args[]){
////    traditional way to filter
////
////        List<Product> prodList =  new ArrayList<>();
////        for(Product proObj : getProduct()){
////            if(proObj.getPrice() > 90000D){
////                prodList.add(proObj);
////            }
////        }
////        for(Product productObj: prodList){
////            System.out.println(productObj);
////
////        }
//
//    //Using stream filter
//        List<Product> streamProd = getProduct().
//                stream().
//                filter(product -> product.getPrice() > 90000D).toList();
//        streamProd.forEach(System.out::println);
//    }
//
//    private static List<Product> getProduct() {
//        List<Product> prodList = new ArrayList<>();
//
//        prodList.add(new Product(1, "Hp", 55000.98));
//        prodList.add(new Product(2, "Lenovo", 55000.98));
//        prodList.add(new Product(3, "dell", 68900.98));
//        prodList.add(new Product(4, "nokia", 95000.98));
//        return prodList;
//    }
//}
