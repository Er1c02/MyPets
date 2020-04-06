public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; // inches

    public Bird (String species, String name, int age, double weight, String color, double wingspan, String food)
    {
        super(name, age, weight, food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }//end full constructor which call super

    public int monthlyFeeding()
    {
        return 8;
    }// end method to determine the number of feedings
    public String Speak()
    {
        return "The Universe is a simulation";
    }

    public String toString()
    {
        String output = super.toString() + "\nColor: " + color;
        output += "\nWingspan: " + wingspan +" inches";
        output += "\nSpecies: " + species;
        return output;
    }// end toString with call to Super

}