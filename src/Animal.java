public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String species;
    String name;
    Boolean isAlive;
    Double weight;
    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case"cenis" :this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case"felis" :this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case"elephant" :this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public void takeForAWalk(){
        this.weight -= 1.0;
        if ( weight <= 0.0)

         System.out.println("pet dead ");  {
            this.isAlive = false;
        }
    }

    public void feed(){
        this.weight += 1.0;
    }

}
