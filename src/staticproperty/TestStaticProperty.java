package staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mec","ahihi");
        System.out.println(Car.numberOfCars);
        Car car2=new Car("for","ahoho");
        System.out.println(Car.numberOfCars);
    }
}
