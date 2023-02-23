public class CarTester {
    public static void main(String[] args) {
        Car[] cars= {new Truck(60000,1000), new Sedan(18,40000)};
        for (int i=0; i< cars.length; i++){
            Car car= cars[i];
            if(i==0){
                System.out.println("Truck Sale Price: "+car.calculateSalePrice());
            } else{
                System.out.println("Sedan Sale Price: "+car.calculateSalePrice());
            }
        }
    }
}



