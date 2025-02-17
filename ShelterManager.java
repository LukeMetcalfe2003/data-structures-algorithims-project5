import java.util.LinkedList;
import java.util.Queue;

public class ShelterManager {
    private Queue<Animal> dog;
    private Queue<Animal> cat;
    private int order;

    // Initialize the queues to Linked List
    public ShelterManager() {
        dog = new LinkedList<>();
        cat = new LinkedList<>();
        order = 0;
    }

    // enQueue the animal to the respective queue
    public void enQueue(Animal animal) {
        animal.setOrder(++order);
        if (animal.getType().equals("dog")) {
            dog.add(animal);
        } else if (animal.getType().equals("cat")) {
            cat.add(animal);
        } else {
            System.out.println("Invalid Animal Type");
        }
    }

    // deQueue the animal from the respective queue
    public Animal deQueueAny() {
        if (dog.isEmpty() && cat.isEmpty()) {
            System.out.println("No animals in the shelter");
            return null;
        }
        if (dog.isEmpty()) return deQueueCat();
        if (cat.isEmpty()) return deQueueDog();

        return (dog.peek().getOrder() < cat.peek().getOrder()) ? deQueueDog() : deQueueCat();
    }

    public Animal deQueueCat() {
        if (cat.isEmpty()) {
            System.out.println("No cats in the shelter");
            return null;
        } else {
            return cat.poll();
        }
    }

    public Animal deQueueDog() {
        if (dog.isEmpty()) {
            System.out.println("No dogs in the shelter");
            return null;
        } else {
            return dog.poll();
        }
    }
}