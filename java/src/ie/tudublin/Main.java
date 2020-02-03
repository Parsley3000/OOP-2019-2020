package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty");
        System.out.println(misty.getName());
        misty.speak();

        Cat topcat = new Cat();
        int i;
        topcat.speak();
        for (i=0 ; i<9 ; i++)
        {
          kill();
        }

    }
}
