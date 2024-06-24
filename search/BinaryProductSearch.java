package datastructure.search;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryProductSearch {

    public static Product binarySearchById(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].getId() == id) {
                return products[mid];
            }
            if (products[mid].getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(5, "Phone", 55000.00),
                new Product(1, "Laptop", 89000.00),
                new Product(2, "Desktop", 45000.00),
                new Product(4, "AC", 75000.00),
                new Product(3, "TV", 80000.00),
        };

        // Sort the products array by id
        Arrays.sort(products, Comparator.comparingInt(Product::getId));

        int searchId = 4;
        Product result = binarySearchById(products, searchId);
        if (result == null) {
            System.out.println("Product not found in array");
        } else {
            System.out.println("Product found: " + result);
        }
    }
}
