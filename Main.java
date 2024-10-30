import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

    /*
    * 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
         two numbers , takes two numbers as input
    * */

        mathematical_operation();

        /*
        * 2. Write a Java program that takes a number as input and prints its multiplication table up to
                10.
        * */
//        try {
//            multiplication_table(10);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        /*
         *3. Write a Java program to print the area and perimeter of a circle.
         * */

//       try {
//           System.out.print("Please enter radius: ");
//           float radius = input.nextFloat();
//
//           if(radius == 0)
//               throw new Exception("radius can't be zero ");
//           if(radius < 0 )
//               throw new Exception("radius can't be zero negative");
//           double pi = 3.14159265359;
//
//           System.out.println("Perimeter = " + radius*pi*2);
//           System.out.println("Area = " + radius*radius*pi);
//
//       } catch (InputMismatchException e) {
//           System.out.println("Input miss match");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }


        /*
         * 4. Java program to find out the average of a set of integers
         * */


//         try {
//             int counter = 0;
//             int sum = 0 ;
//             int number;
//             do {
//                 System.out.print("please enter num or 0 to exit: ");
//                 number=input.nextInt();
//                 sum+=number;
//                 if(number == 0 )
//                    throw new Exception("reach limits");
//                 counter+=1;
//
//
//             }while (number!=0);
//
//             System.out.println("The average is = "+ (float)sum/(float)counter);
//
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
        /*
        *5. Write a Java program that accepts three integers as input, adds the first two integers
            together, and then determines whether the sum is equal to the third integer.
        * */

//        try{
//            System.out.print("Please enter first number: ");
//            int first_number = input.nextInt();
//            System.out.print("Please enter second number: ");
//            int second_number = input.nextInt();
//            System.out.print("Please enter third number: ");
//            int third_number = input.nextInt();
//
//            System.out.print("The result is: ");
//            if((first_number + second_number) != third_number)
//                throw new Exception("not equal");
//            System.out.println((first_number + second_number) == third_number);
//
//        }catch (InputMismatchException e){
//            System.out.println("Input miss match");
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /*
         *
         * 6. Write a Java program to reverse a word
         * */
//
//      try{
//          System.out.print("Please enter a word: ");
//          String orginal_word = input.nextLine();
//          String reverse_word = "";
//
//          for (int i = orginal_word.length()-1; i >= 0  ; i--) {
//
//              reverse_word = reverse_word + orginal_word.charAt(i);
//
//          }
//          System.out.println(reverse_word);
//      } catch (InputMismatchException e) {
//          System.out.println(e.getMessage());
//      } catch (Exception e) {
//          System.out.println(e.getMessage());
//      }

        /*
         * 7 - Java program to check whether the given number is even or odd
         * */

//        try {
//
//            int number=1;
//
//            while ((number!=0)){
//
//                System.out.print("please enter number or 0 to exit: ");
//                number=input.nextInt();
//
//                if(number==0)
//                    throw new Exception("reach limit");
//
//                System.out.print("The number is: ");
//                System.out.println(number%2==0 ? "even" : "odd");
//
//            }
//
//        } catch (InputMismatchException e){
//            System.out.println("Input miss match");
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        /*
         *
         * 8 - Java program to convert the temperature in Centigrade to Fahrenheit
         * */

//        try {
//            System.out.print("Please enter temperature in Centigrade: ");
//            float temperature = input.nextFloat();
//
//            float fahrenheit = temperature*1.8f+32;
//            System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Input miss match");
//        }
//
        /*
        * 9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index.
        *
        * */
//
//        try {
//            System.out.print("Please enter a word: ");
//            String string = input.nextLine();
//
//            System.out.print("Please enter a index of any char: ");
//            int index = input.nextInt();
//
//            System.out.println(string.charAt(index));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println("Input miss match");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        /*
         *10. Write a Java program to print the area and perimeter of a rectangle.
         *
         * */


//       try {
//           System.out.print("Please enter width: ");
//           float width = input.nextFloat();
//
//           System.out.print("Please enter height: ");
//           float height = input.nextFloat();
//
//           if(width<=0 || height <=0)
//               throw new Exception("values can't be right");
//
//           System.out.println("Area = " + width*height);
//
//           System.out.println("Perimeter = " + 2*(width+height));
//       }catch (InputMismatchException e){
//           System.out.println("Input miss match");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }


        /*
         *
         * 11. Write a Java program to compare two numbers.
         * */

//       try{
//           System.out.print("Please enter first number: ");
//           int first_number = input.nextInt();
//           System.out.print("Please enter second number: ");
//           int second_number = input.nextInt();
//
//           if(first_number == second_number ) System.out.println(first_number+" == "+second_number);
//           if(first_number > second_number ) System.out.println(first_number+" > "+second_number);
//           if(first_number >= second_number ) System.out.println(first_number+" >= "+second_number);
//           if(first_number < second_number ) System.out.println(first_number+" < "+second_number);
//           if(first_number <= second_number ) System.out.println(first_number+" <= "+second_number);
//           if(first_number != second_number ) System.out.println(first_number+" != "+second_number);
//
//       } catch (InputMismatchException e) {
//           System.out.println("Input miss match");
//       } catch (Exception e) {
//           System.out.println(e.getMessage());
//       }
        /*
         *
         * 12. Write a Java program to convert seconds to hours, minutes and seconds.
         *
         * */


//            try{
//                System.out.print("Please enter time in seconds: ");
//                int seconds = input.nextInt();
//                if (seconds < 60)
//                    throw new Exception("time is less than minute");
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                seconds = seconds % 60;
//
//                System.out.println(hours+":"+minutes+":"+seconds);
//            } catch (InputMismatchException e){
//                System.out.println("Input miss match");
//            }catch (Exception e) {
//                throw new RuntimeException(e);
//            }


        /*
        *
        * 13. Write a Java program that accepts four integers from the user and prints equal if all
            four are equal, and not equal otherwise.
        * */

//          try {
//              System.out.print("Please enter first number: ");
//              int first_number = input.nextInt();
//              System.out.print("Please enter second number: ");
//              int second_number = input.nextInt();
//              System.out.print("Please enter third number: ");
//              int third_number = input.nextInt();
//              System.out.print("Please enter fourth number: ");
//              int fourth_number= input.nextInt();
//
//              boolean result = first_number == second_number &&
//                      second_number==third_number   &&
//                      third_number==fourth_number;
//
//              System.out.println(result ? "Numbers are equal":"Numbers are not equal! ");
//          } catch (InputMismatchException e) {
//              System.out.println("Input miss match");
//          }catch (Exception e){
//              System.out.println(e.getMessage());
//          }

        /*
        *
        * 14. Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.
        * */


//        try {
//            System.out.print("Please enter first number: ");
//            int number = input.nextInt();
//
//            if(number >0)
//               throw new Exception("Number is positive");
//            else if(number<0)
//                throw new Exception("Number is negative");
//            else
//                throw new Exception("Number is zero");
//        } catch (InputMismatchException e) {
//              System.out.println("Input miss match");
//          }catch (Exception e){
//              System.out.println(e.getMessage());
//          }

        /*
        *
        *15.Write a program to enter the numbers till the user wants and at the end it
            should display the count of positive, negative and zeros entered (End loop use -1 ,
            Don’t count -1).
        * */
//                int zero=0;
//                int positives=0;
//                int negatives=0;
//                int number=0;
//                try {
//
//
//                    while (number!=-1){
//                        System.out.print("please enter num or -1 to exit: ");
//                        number=input.nextInt();
//                        if(number==-1)
//                            throw new Exception("input is -1");
//                        else if(number >0)
//                            positives+=1;
//                        else if(number<0)
//                            negatives+=1;
//                        else
//                            zero+=1;
//                    }
//
//
//                } catch (InputMismatchException e) {
//                        System.out.println("Input miss match");
//                }catch (Exception e){
//                      System.out.println(e.getMessage());
//                  }finally {
//                    System.out.println(positives+" positives");
//                    System.out.println(zero+" zero");
//                    System.out.println(negatives+" negatives");
//                }
//

        /*
        *
        * 16 - Write a program that prompts the user to input an integer and then outputs the
                number with the digits reversed.
        *
        * */

//        try {
//            boolean exit = false;
//            String orginal_integer="";
//            String reverse_integer = "";
//            while (!exit){
//
//                System.out.print("Please enter an integer: ");
//                orginal_integer =  input.nextLine();
//                if(!orginal_integer.matches("\\d+"))
//                    throw new InputMismatchException("integer only");
//                else
//                    exit=true;
//            }
//
//
//            for (int i = orginal_integer.length()-1; i >= 0  ; i--) {
//
//                reverse_integer = reverse_integer + orginal_integer.charAt(i);
//
//            }
//            System.out.println(reverse_integer);
//        }  catch (InputMismatchException e) {
//                        System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        /*
        *
        * 17 - Write a program to enter the numbers till the user wants and at the end the
                program should display the largest and smallest numbers entered.
        *
        * */



//
//        int largest=-99999999;
//        int smallest =9999999;
//        int number=0;
//       try {
//
//
//           while (number!=-1){
//               System.out.print("please enter num or -1 to exit: ");
//               number=input.nextInt();
//
//               if(number==-1)
//                   throw new Exception("input is -1");
//               else if(largest<number)
//                   largest = number;
//               else if (smallest > number)
//                   smallest = number;
//
//           }
//
//
//
//       } catch (InputMismatchException e) {
//           System.out.println("input miss match");
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }finally {
//           System.out.println("The large number: "+ largest);
//           System.out.println("the small number: "+ smallest);
//       }


        /*
        * 18 - Determine and print the number of times the character ‘a’ appears in the input
                entered by the user.
        *
        * */

//                try {
//                    System.out.print("Please enter a word: ");
//                    String word = input.nextLine();
//
//                    if(word.matches("\\d+"))
//                        throw new InputMismatchException("number not allowed");
//                    int counter = 0 ;
//                    for (int i = 0; i <= word.length()-1 ; i++) {
//
//                        if(word.charAt(i) == 'a')
//                            counter+=1;
//
//                    }
//                    System.out.println(counter);
//                }catch (InputMismatchException e){
//                    System.out.println(e.getMessage());
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }















    }

    public static void mathematical_operation() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please enter first number: ");
            int first_number = input.nextInt();
            System.out.print("Please enter second number: ");
            int second_number = input.nextInt();

            System.out.println("----------- mathematical operation -----------");
            System.out.println(
                    first_number + " + " + second_number + " = " + (first_number + second_number)
                            + "\n" + first_number + " - " + second_number + " = " + (first_number - second_number)
                            + "\n" + first_number + " * " + second_number + " = " + (first_number * second_number)
                            + "\n" + first_number + " / " + second_number + " = " + ((float) first_number / (float) second_number)
                            + "\n" + first_number + " % " + second_number + " = " + (first_number % second_number)
            );
        }catch (InputMismatchException e){
            System.out.println("Input miss match");
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }


    }

    public static void multiplication_table(int ex )throws Exception {

        for (int i = 1; i <=100 ; i++) {

            System.out.println(ex+" x "+i+" = "+ ex*i);
            if(i == ex)
                throw new Exception("reach maximum limit");

        }
//        }

    }

}
