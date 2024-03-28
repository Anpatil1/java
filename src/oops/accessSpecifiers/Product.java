package oops.accessSpecifiers;

import lombok.*;

//1. all arguments constructor
//2. no argument constructor
//3.  getters and setters
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int productId;
    private String productName;
    private int productPrice;


/*
    public String toString(){
        return "Product[" +
                "Product ID = " +this.productId+
                "Product Name = " +this.productName+
                "Product Price = " +this.productPrice+
                "]";
    }*/
}