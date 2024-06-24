package datastructure.search;

import java.util.Arrays;
import java.util.Comparator;

public class JumpProductSearch {

    static Product jumpSearchById(Product[] products, int id) {
        int n = products.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        System.out.println("Array length is: " + n);
        System.out.println("Step value is: " + step);

        // Finding the block where the element is present (if it is present)
        while (products[Math.min(step, n) - 1].getId() < id) {
            prev = step;
            System.out.println("prev is: " + prev);
            step += (int) Math.floor(Math.sqrt(n));
            System.out.println("step is: " + step);

            if (prev >= n) {
                System.out.println("Prev is: " + prev);
                return null;
            }
        }

        System.out.println("------------");

        // Doing a linear search for id in block beginning with prev
        while (prev < n && products[prev].getId() < id) {
            prev++;
            System.out.println("within while prev is: " + prev);

            if (prev == Math.min(step, n)) {
                System.out.println("within while - if: " + prev);
                return null;
            }
        }

        // If element is found
        if (prev < n && products[prev].getId() == id) {
            System.out.println("if equals: " + prev);
            return products[prev];
        }

        System.out.println("Iteration end: ");
        System.out.println("------------");
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Phone", 55000.00),
                new Product(2, "Laptop", 89000.00),
                new Product(3, "Desktop", 45000.00),
                new Product(4, "AC", 75000.00),
                new Product(5, "TV", 80000.00),
        };

        // Sort the products array by id
        Arrays.sort(products, Comparator.comparingInt(Product::getId));

        int searchId = 2;
        Product result = jumpSearchById(products, searchId);

        if (result != null)
            System.out.println("Product found: " + result);
        else
            System.out.println("Product not found in array");
    }
}
