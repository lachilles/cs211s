/* Homework for module 1 Class Design in CS211S - Lianne Achilles

 */

class Main
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[3];

        cars[0] = new Sedan("Tesla", "Model 3", "silver", 272);
        // 272 mile range on electric battery
        cars[1] = new SUV("Honda", "CRV", "gold", 500);
        // 500 mile range if hybrid
        cars[2] = new Minivan("Toyota", "Sienna", "navy", 600);
        // 600 miles on gas

        for(Car c : cars)
        {
            System.out.println(c); // toString() method called here.
            c.travel();
            System.out.println();
        }
    }
}
