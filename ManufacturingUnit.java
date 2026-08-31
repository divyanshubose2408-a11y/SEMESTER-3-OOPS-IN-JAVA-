class Car {
   static int count = 0;

  Car() {
    count++;
  }
}

public class ManufacturingUnit {
     public static void main(String[] args) {
       
       Car c1 = new Car();
       Car c2 = new Car();
       Car c3 = new Car();
       Car c4 = new Car();
       Car c5 = new Car();

       System.out.println("Number of units produced from manufacturing units: " + Car.count);
   }
}
