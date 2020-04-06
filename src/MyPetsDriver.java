public class MyPetsDriver
{


    public static void main(String [] args)
    {
        Pet pablo = new Dog ( "Pablo", "Chihuahua", 5, 25.0, "kibble");
        Pet tony = new Bird("Parrot","Tony",2,10.0,"Blue",24.2,"Seeds");
System.out.println(pablo);
System.out.println(tony);
        //Pet rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        //Pet mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2);
        //Pet donald = new Bird("Duck", "Donald", 85, 1.13, "white", 5000);
        //Pet secret = new Pet("Secret", 7, 40.2); Pet is an abstract class and cannot be instantiated.

//        System.out.println(rex.fetch()); //only works when Rex is a Dog, NOT when rex is a Pet.
        //  System.out.println(rex.Speak()); //dependent upon what type Rex, Dog vs Pet

//        int[] arrayOfInts = new int[5]; // and example of how to instantiate an array
//        Pet[]  menagerie = new Pet[5]; //Starting to create an array of pets
//        menagerie[0] = rex;
//        menagerie[1] = mochi;
//        menagerie[2] = donald;
//
//        for( int i = 0; i < menagerie.length; i++)
//        {
//            System.out.println(menagerie[i]);
//        }

        // Speaking to Pets
//        System.out.println("Rex says: " + rex.Speak());
//        System.out.println("Mochi says: " + mochi.Speak());
//        System.out.println("Donald says: " + donald.Speak());

        //Check unit conversion
//        System.out.println("Rex's weight in pounds is " + rex.AmericanFreedomUnits() + ".\n");

        //Testing Pets
//        System.out.println(rex);
//        System.out.println(mochi);
//        System.out.println(donald);

    }
}