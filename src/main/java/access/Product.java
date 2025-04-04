package access;

public class Product {
    public String publicName;//can be accessed from anywhere
    protected String protectedName;
    String defaultName;
    private String privateName;

    //can be accessed from anywhere
    public void makePublicCalculation(){
        System.out.println("Calling public method...");
    }

    //only in subclass in the same package
    protected void makeProtectedCalculation(){
        System.out.println("Calling protected method...");
    }

    //only in subclass even in different package
    void makeDefaultCalculation(){
        System.out.println("Calling default method...");
    }

    //can be accessed only from the current class
    private void makePrivateCalculation(){
        System.out.println("Calling private method...");
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.publicName = "Public Name";
        product.privateName = "Protected Name";
        product.defaultName = "Def Name";
        product.protectedName = "Protected Name";

        product.makePublicCalculation();
        product.makeDefaultCalculation();
        product.makeProtectedCalculation();
        product.makePrivateCalculation();
    }
}
