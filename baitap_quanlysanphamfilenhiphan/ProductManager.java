package baitap_quanlysanphamfilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends ArrayList<Product> {
    public static final String FILE_PATH = "D:\\module222\\src\\baitap_quanlysanphamfilenhiphan\\Product.txt";
    private int size = 0;
    private List<Product> productList = new ArrayList<>();
    public ProductManager(){
    }
//    void editProduct(int id, String name, String brand, int price, String more){
//        searchByID(id).setName(name);
//        searchByID(id).setPrice(price);
//        searchByID(id).setBrand(brand);
//    }
    private Product searchByID(int id){
        for (Product product : this){
            if (id == product.getId()){
                return product;
            }
        }
        return null;

    }
    void searchByName(String name){
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
    public void writeFileProduct() throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            objectOutputStream = new ObjectOutputStream(fos);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id product: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name product: ");
            String name = scanner.nextLine();
            System.out.println("Enter brand product: ");
            String brand = scanner.nextLine();
            System.out.println("Enter price product: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter more product: ");
            String more = scanner.nextLine();
            productList.add(size, new Product(id, name, brand, price, more));
            size++;
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
        }
    }
    public static void readFileProduct(){
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fis);
            List<Product> productList = (List<Product>) objectInputStream.readObject();
            for (Product product : productList){
                System.out.println("id:" + product.getId() + ", Name:" + product.getName() + ",Brand:" + product.getBrand()
                + ",Price:" + product.getPrice() + ",More:" + product.getMore());
            }
            objectInputStream.close();
        }catch (FileNotFoundException  | ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void findTheProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name you want find: ");
        String findName = scanner.nextLine();
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fis);
            List<Product> productList1 = (List<Product>) objectInputStream.readObject();
            for (Product product : productList1){
                if (product.getName().toLowerCase().contains(findName.toLowerCase())){
                    System.out.println("Pro looking in list: id: " + product.getId() + ",Name:" + product.getName()
                    + ",Brand:" + product.getBrand() + ",Price:" + product.getPrice() + ",More:" + product.getMore());
                }
            }
            objectInputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ProductManager productManager = new ProductManager();
        int choice = 0;
        while (choice != -1){
            System.out.println("Menu: ");
            System.out.println("1.Add Product: ");
            System.out.println("2.Display Product: ");
            System.out.println("3.Search Product: ");
            System.out.println("4.Exit");
            System.out.println("Enter the choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.writeFileProduct();
                    break;
                case 2:
                    readFileProduct();
                    break;
                case 3:
                    productManager.findTheProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
