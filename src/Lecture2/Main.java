package Lecture2;

public class Main {

    //psvm metod
    public static void main(String[] args) {
        /*
        //8'den 12'ye Kümülatif bir şekilde Bir ürün nesnesi oluşturduk
        Product product1 = new Product(); // Referans oluşturma ,Örnek oluşturma,instance
        product1.id = 1;
        product1.name ="Lenovo V14";
        product1.unitPrice= 15000;
        product1.detail="16 GB Ram";

        Product product2 = new Product();
        product2.id = 2;
        product2.name ="Lenovo V15";
        product2.unitPrice= 16000;
        product2.detail="32 GB Ram";

        Product product3 = new Product();
        product3.id = 3;
        product3.name ="HP 5";
        product3.unitPrice= 10000;
        product3.detail="8 GB Ram"; */

        Product product1 = new Product(1,"Lenovo V14",15000,"16GB RAM");
        Product product2 =new Product(2,"Lenovo V15",16000,"32GB RAM");
        Product product3=new Product(3,"HP 5",10000,"8GB RAM");

        Product[] products = {product1,product2,product3};

        //Product verinin türü for başında ikincisi takma isim
        for (Product ürünler: products) {
            System.out.println(ürünler.name);
        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2 = new Category();
        category2.id=2;
        category2.name="Ev/Bahçe";

        Category category3 = new Category();
        category3.id=3;
        category3.name="Hobi & Oyun";

        //  veri tipi     örnek ismi       cons çalıştırmak için veritipinden gidiyoruz
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

    }
}
