public class Dog extends Pet
{
    private String breed;

    public Dog (String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    }//end full constructor with call to super


    public int MonthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }//end if puppy
        else
        {
            dailyFeedings = 1;
        }//end else adult
        return dailyFeedings * 30;
    }//end method explaining how many feedings per month, for budgetary reasons

    public String fetch()
    {
        if (Math.random() >= 0.5)
            return "Fetch accomplished";
        else
            return "No fetching here";
    }//end method that exists in Dog but not Pet to demo Polymorphism issue


    public String Speak()
    {
        if (this.age < 2)
            return "Yip";
        return "Woof";
    }//end method Speak which overrides abstract method in Pet

    public String toString()
    {
        String output = super.toString() +"\nBreed: " + breed;
        return output;
    }//end toString with call to super
}//end class Dog