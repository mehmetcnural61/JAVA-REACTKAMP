package Lecture2;

public class Product {

    //Constructor (Yapıcı)
    public  Product(){

        System.out.println("Ben Çalıştım");
    }

    public  Product(int id,String name,double unitPrice,String detail){
        this.id = id;
        this.name= name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    }

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    int id;
    String name;
    double unitPrice;
    String detail;

}

