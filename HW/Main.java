package HW;
//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Can Berk Kilic
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println("Increment: " + lab.increment(1));
    
    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

    
    int i = 0;
    while (i < numbers.length) {
      System.out.print(numbers[i] + " ");
      i++;
    }


    System.out.println();

    
    for (int j = numbers.length - 1; j >= 0; j--) {
      System.out.print(numbers[j] + " ");
    }


    System.out.println();

   
    System.out.println("First: " + numbers[0]);
    System.out.println("Last: " + numbers[7]);

    
    System.out.println("Max : " + lab.max(5, 9));
    System.out.println("Min : " + lab.min(3, 12));
    System.out.println("Sum: " + lab.sum(numbers));
    System.out.println("Average: " + lab.average(numbers));
    System.out.println("Max in array: " + lab.max(numbers));
    System.out.println("Min in array: " + lab.min(numbers));
  }
}     



class Lab1 {


  public int increment(int numbers) {
    return ++numbers;
  }

  public int max(int x, int y) {
    if (x > y)
      return x;
    else
      return y;
  }

  public int min(int x, int y) {
    if (x < y)
      return x;
    else
      return y;
  }

  public int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    return total;
  }

  public double average(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    return (double) total / numbers.length;
  }

  public int max(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max)
        max = numbers[i];
    }
    return max;
  }

  public int min(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min)
        min = nums[i];
    }
    return min;
  }











}




  