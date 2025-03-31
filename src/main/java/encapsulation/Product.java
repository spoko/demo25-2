package encapsulation;

public class Product {
    //characteristics
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    //setters and getters
    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Name cannot be empty");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0){
            this.cost = cost;
        }else {
            System.out.println("Money cannot be negative");
        }
    }

    //constructor
    public Product(String name, int cost){
        setName(name);
        setCost(cost);
    }
}
