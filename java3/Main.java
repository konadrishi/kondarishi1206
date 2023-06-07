public class Main {
    public static void main(String[] args){
        System.out.println("This is From Department");
        cs a= new cs(10);
        a.getDepartmenSize();
        System.out.println("Size Department: "+ a.getDepartmenSize());
        System.out.println(" ");
        System.out.println("This is From Product");
        Product pd=new Product();
        pd.setPrice();

        System.out.println("this is setprice() from Product: "+ pd.getPrice() );
        pd.setPrice(10);
        System.out.println("This is for setprice(10) from product: "+ pd.getPrice());

        System.out.println(" ");
        System.out.println("This is From Bike");
        Bike b1=new Bike();
        Bike b2=new Motor();
        b1.makeSound();
        b2.makeSound();


    }
}
