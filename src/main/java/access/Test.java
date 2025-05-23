package access;

public class Test {
    public static void main(String[] args) {
        //creating an instance from class Product
        Product product = new Product();

        //we can access public from anywhere
        product.publicName = "Public Name";
        product.makePublicCalculation();

        //we can access protected since Product and Test classes are in the same package
        product.protectedName = "Protected Name";
        product.makeProtectedCalculation();

        //we can access default since Product and Test classes are in the same package
        product.defaultName = "Default Name";
        product.makeDefaultCalculation();

        //we can`t access anything that is private outside the class that its class
//        product.privateName = "Private Name";
//        product.makePrivateCalculation();
    }
}
