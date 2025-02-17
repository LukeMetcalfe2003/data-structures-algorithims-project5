public class Main {
    public static void main(String[] args){
        ShelterManager sm = new ShelterManager();

        sm.enQueue(new Animal("Tommy", "dog" ));
        sm.enQueue(new Animal("Kitty", "cat"));
        sm.enQueue(new Animal("Buddy", "dog"));
        sm.enQueue(new Animal("Misty", "cat"));

        // Taking a cat
        Animal adotpedAnimalCat = sm.deQueueCat();
        if (adotpedAnimalCat != null) {
            System.out.println("You have chosen to take a cat named: " + adotpedAnimalCat.getName());
        } else {
            System.out.println("No cat available for adoption. ");
        }

        // For taking a dog.
        Animal adoptedAnimalDog = sm.deQueueDog();
        if (adoptedAnimalDog != null) {
            System.out.println("You have chosen to take a dog named: " + adoptedAnimalDog.getName());
        } else {
            System.out.println("No dogs available for adoption. ");
        }
    }
}
