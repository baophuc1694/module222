package baitap_collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(0, "iPhone", 100);
        Product product2 = new Product(1, "SamSung", 80);
        Product product3 = new Product(3, "Oppo", 35);
        Product product4 = new Product(4, "Sony", 48);
        Product product5 = new Product(5, "Motorola", 55);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product5);
        System.out.println("Enter a number: " + "\n"
                + "1.Add product" + "\n"
                + "2.Edit product" + "\n"
                + "3.Delete product" + "\n"
                + "4.Display product" + "\n"
                + "5.Search product" + "\n"
                + "6.Sort product" + "\n");
        int choice = 1;
        while (choice != 0) {
            System.out.println("Choose a number");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1://THêm vào
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Add new product");
                    System.out.println("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter Name: ");
                    String productName = scanner.nextLine();

                    System.out.println("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Product newProduct = new Product(id, productName, price);
                    productManager.add(newProduct);
                    productManager.display();
                    break;
                case 2://sửa
                    System.out.println("Enter the product what you want the to edit: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int num = scanner1.nextInt();
                    System.out.println("Edit Name");

                    Scanner scanner2 = new Scanner(System.in);
                    String name = scanner2.nextLine();

                    System.out.println("Edit price");
                    Scanner scanner3 = new Scanner(System.in);
                    double money = scanner3.nextDouble();

                    productManager.editProduct(num, name, money);
                    productManager.display();
                    break;
                case 3://xoá sản phẩm
                    Scanner number3 = new Scanner(System.in);
                    System.out.println("Enter product you want delete: ");
                    int name3 = number3.nextInt();
                    System.out.println("The product delete: " + productManager.remove(name3));
                    break;
                case 4://trưng bày sản phẩm
                    productManager.display();
                    break;
                case 5://tìm kiếm sản phẩm
                    System.out.println("Enter the product name's what you want to search: ");
                    Scanner scanner6 = new Scanner(System.in);
                    String name1 = scanner6.nextLine();
                    productManager.searchByName(name1);
                    break;
                case 6: //sắp xếp
                    System.out.println("Sort");
                    productManager.sort((pro1, pro2) -> {
                        if (pro1.getPrice() < pro2.getPrice())
                            return 1;
                        else if (pro1.getPrice() > pro2.getPrice())
                            return -1;
                        else
                            return 0;
                    });
                    productManager.sort(new Product());
                {

                    for (Product product: productManager){
                        System.out.println(product);
                    }
                }
                break;




            }
        }
    }
}
