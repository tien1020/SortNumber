//CS200
//Spring, 2020 
//Tien Nguyen
//Instructor: Y. Gutstein 
//HW1: Method
//Due: Feb 25th 
//File name: Methods.jav

import java.util.Scanner;
public class Methods
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num1 = kbd.nextInt();
      System.out.print("Enter a number: ");
      int num2 = kbd.nextInt();
      System.out.print("Enter a number: ");
      int num3 = kbd.nextInt();
         if ((num1 < num2) && (num2 < num3)){
            System.out.println(num1 + " " + num2 + " " + num3);
            }
         if ((num1 < num2) && (num2 > num3)){
            System.out.println(num1 + " " + num3 + " " + num2);
            }
         if ((num1 > num2) && (num2 > num3)){
            System.out.println(num3 + " " + num2 + " " + num1);
            }
         if ((num1 > num2) && (num2 < num3)){
            System.out.println(num2 + " " + num1 + " " + num3);
            }      
   }
 }
