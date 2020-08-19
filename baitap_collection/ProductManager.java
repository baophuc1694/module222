package baitap_collection;



import java.util.ArrayList;

public class ProductManager extends ArrayList<Product> {
    public ProductManager(){
    }
    public void editProduct(int id, String name, double price){
        searchById(id).setName(name);
        searchById(id).setPrice(price);
    }

    private Product searchById(int id) {
        for (Product product : this) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }
    public void searchByName(String name){
        for (Product product : this) {
            if (name.equals(product.getName())) {
                System.out.println(product.toString());
            }
        }
        System.out.println("This product want founded in this list");
    }
    public void display(){
        for (Product product : this) {
            System.out.println(product.toString());
        }
    }


}
