public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("pies");
        dog.name = "Szarik";
        //dog.isAlive = "true";
        dog.weight = 10.4;
        Car seat = new Car("abc","seat");

        seat.color = "czarny";
        seat.milage = 4000;
        seat.weight = 1500;
        seat.isOn = true;

        System.out.println("Zwierze nazywa się " + dog.name);
        System.out.println(dog.isAlive);

        System.out.println(dog.weight);
        dog.feed();
        System.out.println(dog.weight);

        Human me = new Human(1988);
        System.out.println(me.yearOfBirth);
        Human sister = new Human (1990);
        System.out.println(sister.yearOfBirth);

        Car fiat1 = new Car ("Nissan","Micra");
        Car fiat2 = new Car ("Nisan","Micra");

     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();
     dog.takeForAWalk();


    }
}