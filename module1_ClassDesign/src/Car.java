/* Car class file for Module 1 Homework 1
   CS 211S - Lianne Achilles
   This Car class works with the provided test main function.
*/

public class Car {
    // declare instance variables
    private String make;
    private String model;
    private String color;
    private int range;

    // constructor definitions:
    public Car()
    {
        // Empty constructor just to allow Car to be
        // constructed with null strings for its
        // instance variables.
    }
    // constructor to set values for instance variables
    public Car(String make, String model, String color, int range)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.range = range;
    }

    public void setrange(int range) {
        this.range = range;
    }

    public int getrange() {
        return this.range;
    }

    public String getColor() {
        return this.color;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    // The String format of a Car return make, model, color and range.
    public String toString()
    {
        return String.format("%s %s %s with a range of %d miles", make, model, color, range);
    }

    // .equals method to compare two Car objects, returning true if all their attributes are
    // the same.
    public boolean equals(Car other)
    {
        return make == (other.make) && model == (other.model) && color == (other.color) && range == (other.range);
    }

    public void travel() {
    }
}
