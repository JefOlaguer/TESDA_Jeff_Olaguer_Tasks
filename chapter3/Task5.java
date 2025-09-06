package chapter3;

import java.util.*;

// Program that takes in three numbers from the user and outputs the largest number. If all numbers are equal, it will print "All numbers are equal"

public class Task5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>(3);

        for(int i=0; i<3; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	numbers.add(scanner.nextDouble());
        }
        double largest = Collections.max(numbers);

        if (numbers.get(0).equals(numbers.get(1)) && numbers.get(0).equals(numbers.get(2))){
            System.out.println("All are equal");
        } else {

        System.out.println("The largest number is: " + largest); 
            }
            scanner.close();
}
}

