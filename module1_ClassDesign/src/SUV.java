class SUV extends Car
{
    public SUV(String make, String model, String color, int maxRange)
    {
        // call Car constructor with parameters
        super(make, model, color, maxRange);
    }

    @Override
    public void travel()
    {
        System.out.println("Zoom zoom!");
    }
}
