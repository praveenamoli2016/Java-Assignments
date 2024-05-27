package com.wuelevate;

import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  
        
     // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
        
     // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
        
        // max() method to get max Product price     
        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productA.price);    
        // min() method to get min Product price    
        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        System.out.println(productB.price);    
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
        // This is more compact approach for filtering data  
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));    
        
        Float totalPrice = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
    System.out.println(totalPrice);  
    // More precise code   
    float totalPrice2 = productsList.stream()  
            .map(product->product.price)  
            .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
    System.out.println(totalPrice2);  
//        List<Float> productPriceList = new ArrayList<Float>();  
//        for(Product product: productsList){  
//              
//            // filtering data of list  
//            if(product.price<30000){  
//                productPriceList.add(product.price);    // adding price to a productPriceList  
//            }  
//        }  
//        System.out.println(productPriceList);   // displaying data  
        
        
        
        List<Float> productPriceList2 =productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
System.out.println(productPriceList2);  
    }  
}  