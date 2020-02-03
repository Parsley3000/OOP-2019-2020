package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }

    public void kill(int lives)
    {

      lives = this.numLives - 1;
      if (lives > 0 )
      {
        System.out.println("Ouch!");
      }
      else if (lives == 0)
      {
        System.out.println("Dead");
      }
    }
}
