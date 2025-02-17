public class Animal extends ShelterManager {
    private String name;
    private String type;
    private int order;

    public Animal(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}