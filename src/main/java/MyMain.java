import java.util.*;
public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double mean = mat[0][0];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                mean+=mat[row][col];
            }
        }
        return mean/(mat.length*mat[0].length);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE
        Vector<Double> numbers = new Vector<Double>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                numbers.add(mat[row][col]);
            }
        }
        if(mat.length*mat[0].length%2==0){
            int p = numbers.size()/2;
            return (numbers.elementAt(p)+numbers.elementAt(p-1))/2;
        }
        else{
            return numbers.elementAt(numbers.size()/2);
        }
        
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        HashMap<Double, Integer> numbers = new HashMap<Double, Integer>();
        double mode=0;
        double max = mat[0][0];

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                double n = mat[row][col];
                
                if(!numbers.containsKey(n)){
                    numbers.put(n, 1);
                    if(numbers.get(n)>=max){
                        max = numbers.get(n);
                        mode = n;
                    }
                }
                else{
                    numbers.put(n, numbers.get(n) + 1);
                }
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        double[][] m2 = {
        {1,  2,  4,  5,  6},
        {7,  9,  10, 12, 13},
        {14, 15, 17, 18, 20},
        {22, 23, 27, 30, 32},
        {33, 37, 38, 42, 44}
        };

    System.out.println(median(m2));
    }
}
