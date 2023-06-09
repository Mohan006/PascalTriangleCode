import java.util.ArrayList;
import java.util.List;
import java.util.*;

class PascalTriangle {
    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            
            // Compute the values for the current row
            if (row > 0) {
                List<Integer> previousRow = triangle.get(row - 1);
                
                currentRow.add(1);
                
                for (int i = 0; i < previousRow.size() - 1; i++) {
                    int sum = previousRow.get(i) + previousRow.get(i + 1);
                    currentRow.add(sum);
                }
                
                currentRow.add(1);
            } else {
                currentRow.add(1);
            }
            
            // Add the current row to the triangle
            triangle.add(currentRow);
        }
        
        return triangle;
    }
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int numRows=sc.nextInt();
        List<List<Integer>> pascalTriangle = pascalTriangle(numRows);
         int n=numRows;
        
       
        for (List<Integer> row : pascalTriangle) {
             System.out.print(" ".repeat(n));
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
              n-=1;
        }
    }
}

//code Explnation

/*This code defines a class PascalTriangle with a static method generatePascalTriangle that takes the number of rows you want to generate as input and returns a list of lists representing the Pascal's Triangle.

It uses a list of lists (triangle) to store the triangle rows. It iterates over each row from 0 to numRows - 1 and creates a new list called currentRow to store the values of the current row.

For rows greater than 0, it retrieves the previous row from triangle and calculates the values for the current row by summing adjacent elements from the previous row. The computed values are added to currentRow.

The completed currentRow is added to triangle and, at the end, the method returns the generated triangle.

In the main method, it demonstrates an example usage by generating a Pascal's Triangle with 5 rows and printing the triangle. */



// PascalTrangel Concept 

/*Certainly! Pascal's Triangle is a triangular arrangement of numbers where each number is the sum of the two numbers directly above it. The triangle starts with a single "1" at the top, and each row below it is generated by summing the adjacent elements from the previous row and adding "1" at both ends.

For example, the first few rows of Pascal's Triangle look like this:

       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
In this triangle, the number at the i-th row and j-th column (0-based index) represents the binomial coefficient C(i, j), which gives the number of ways to choose j elements from a set of i elements.

Pascal's Triangle has many interesting properties and applications in combinatorics, probability, and number theory. It is named after the French mathematician Blaise Pascal, who introduced it in the 17th century.

To generate Pascal's Triangle, each row can be computed by adding adjacent elements from the previous row. The first and last elements of each row are always 1. The algorithm iteratively builds the triangle row by row, starting from the top and moving downwards. */