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



    int id;
    String name;
    double unitPrice;
    String detail;

}

