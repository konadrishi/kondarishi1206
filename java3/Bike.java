public class Bike {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void makeSound() {
        System.out.println("Sound from Bike");
    }
}

class Motor extends Bike {
    @Override
    public void makeSound() {
        System.out.println("Sound from Motor");
    }
}
