import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          /* 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
      of two numbers , takes two numbers as input   */
/*
try {

    System.out.print("Please enter the first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Please enter the second number: ");
    int secondNumber = input.nextInt();

    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));
}catch (InputMismatchException e){
    System.out.println("Invalid input, please try again with digits only!");

}catch (ArithmeticException e){
    System.out.println(e.getMessage());

}catch (Exception e){
    System.out.println(e.getMessage());
}
*/

   /* 2.Write a Java program that takes a number as input and prints its multiplica */

        /*
try {
    System.out.print("Please enter a number: ");
    int number = input.nextInt();

    for (int i = 1; i <= 10; i++) {
        int result = number * i;
        System.out.println(number + " x " + i + " = " + result);
    }
}catch (InputMismatchException e){
    System.out.println("Invalid input, please try again with digits only!");
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}catch (Exception e){
    System.out.println(e.getMessage());
}
 */




/* 3.Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

/*
try {

    System.out.print("Radius= ");
    double radius = input.nextDouble();
    validateRadius(radius);

    double area = Math.PI * radius * radius;
    double perimeter = 2 * Math.PI * radius;
    System.out.println("Perimeter is= " + perimeter);
    System.out.println("Area is= " + area);

}catch (InputMismatchException e){
    System.out.println("Invalid input please try again (digits only)!");
} catch (RuntimeException e){
    System.out.println(e.getMessage());
} catch (Exception e){
    System.out.println(e.getMessage());
}

 */



     /* 4. Java program to find out the average of a set of integer. */

/*

try {
            System.out.println("Enter the count of numbers: ");
            int countnumbers = input.nextInt();
            checkAverage(countnumbers);

            double sum = 0;
            for (int i = 0; i < countnumbers; i++) {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                sum += number;
            }
            double average = sum / countnumbers;
            System.out.println("The average is: " + average);

        }catch (InputMismatchException e) {
         System.out.println("Invalid input please try again (digits only)!");
        }catch (ArithmeticException e) {
         System.out.println(e.getMessage());
      } catch (Exception e) {
             System.out.println(e.getMessage());
        } */


  /* 5.Write a Java program that accepts three integers as input, adds the first two integers together,
                and then determines whether the sum is equal to the third integer.*/
/*
try {
    System.out.print("Input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Input the second number: ");
    int num2 = input.nextInt();
    System.out.print("Input the third number: ");
    int num3 = input.nextInt();

    int sum = num1 + num2;
    boolean sumequals = true;

    if (sumequals = sum == num3) {
        System.out.println("The result is: " + sumequals);
    } else {
        System.out.println("The result is: " + sumequals);
    }
}catch (InputMismatchException e) {
    System.out.println("Invalid! Please enter a number.");
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}catch (Exception e) {
    System.out.println(e.getMessage());
}
*/



 // 6.Write a Java program to reverse a word.

/*
try {
    System.out.println("Please enter a word to reverse it:  ");
    String word = input.nextLine();
    empty(word);
    StringBuilder reverseword = new StringBuilder(word);
    reverseword.reverse();
    System.out.print("Reverse word: " + reverseword.toString());
}catch (Exception e) {
    System.out.println(e.getMessage());
}
*/

 /*7.Java program to check whether the given number is even or odd. */

        /*
  try {
      System.out.println("Please enter a number:  ");
      int number = input.nextInt();
      if (number % 2 == 0) {
          System.out.println("The number is even");
      } else {
          System.out.println("The number is odd");
      }
  }catch (InputMismatchException e) {
      System.out.println("Invalild Input! Please enter digits only.");
  }catch (Exception e) {
      System.out.println("Something went wrong! Please try again.");
  } */




    // 8 - Java program to convert the temperature in Centigrade to Fahrenheit

        /*
        try {
            System.out.println("Enter the temperature in Centigrade: ");
            double temperature = input.nextDouble();
            double fahrenheit = temperature * 1.8 + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }catch (Exception e) {
            System.out.println("Something went wrong, please try again!");
        } */




  /* 9.Write a Java program that takes a string and a number from the user
       then prints the character in the given index.*/


        /*
    try {
    System.out.println("Please enter a string: ");
    String str = input.nextLine();
    System.out.println("Please enter a number: ");
    int index = input.nextInt();
    System.out.println(str.substring(index, index + 1));

    }catch(InputMismatchException e) {
    System.out.println("Invalid input!");
    }catch(StringIndexOutOfBoundsException e) {
    System.out.println("Index out of bounds! Please insure the index is whithin the bounds of the string!");
    }catch(Exception e) {
    System.out.println("Something went wrong, please try again later!");
    }
     */




  /*10. Write a Java program to print the area and perimeter of a rectangle. */

        /*
try {
    System.out.print("Width= ");
    double width = input.nextDouble();
    System.out.print("Height= ");
    double height = input.nextDouble();

    double area = width * height;
    double perimeter = 2 * (width + height);

    System.out.println("Area is " + width + "*" + height + " = " + area);
    System.out.println("Perimeter is " + "2*(" + width + "+" + height + ") = " + perimeter);
}catch (InputMismatchException e){
    System.out.println("Invalid input, please try again with valid number!");
}catch (Exception e){
    System.out.println("Somthing went wrong, please try again later!");
}
*/










/*11.Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39 */

        /*
try {
    System.out.print("Input first integer:");
    int first = input.nextInt();
    System.out.print("Input second integer:");
    int second = input.nextInt();

    if (first != second && first <= second) {
        System.out.println(first + " !=" + second);
        System.out.println(first + " <= " + second);

    } else {
        System.out.println(second + " !=" + first);
    }
    if (first < second) {
        System.out.println(first + " < " + second);
    } else {
        System.out.println(second + " < " + first);
    }

}catch(InputMismatchException e) {
    System.out.println("Invalid input, please try again with a valid number!");
}catch(ArithmeticException e) {
    System.out.println(e.getMessage());
}catch(Exception e) {
    System.out.println("An unexpected error occurred, please try again!");
}
*/


 /* 12.Write a Java program to convert seconds to hours, minutes and seconds.
 Sample Output:
  Input seconds: 86399
  23:59:59 */

    /*
        try {
            System.out.println("Input seconds: ");
            int seconds = input.nextInt();
            System.out.println("Convert seconds to hours: ");
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int second = seconds % 60;
            System.out.print(hours + ":" + minutes + ":" + second);
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please try again!");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Something went wrong. Please try again!");
        }
*/


/* 13. Write a Java program that accepts four integers from the user and prints equal
if all four are equal, and not equal otherwise.
Sample Output:
Input first number: 25 Input second number: 37 Input third number: 45
Input fourth number: 23 Numbers are not equal!*/

/*
try {
    System.out.print("Input first number:");
    int firstdnumber = input.nextInt();
    System.out.print("Input second number:");
    int secondnumber = input.nextInt();
    System.out.print("Input third number:");
    int thirdnumber = input.nextInt();
    System.out.print("Input fourth number:");
    int fourthnumber = input.nextInt();

    boolean allequallfour = true;

    if (fourthnumber != secondnumber) {
        allequallfour = false;
    } else if (firstdnumber != thirdnumber) {
        allequallfour = false;
    } else if (firstdnumber != thirdnumber) {
        allequallfour = false;
    }

    if (allequallfour) {
        System.out.println("Numbers are Equal!");
    } else {
        System.out.println("Numbers are Not equal!");
    }
}catch (InputMismatchException e) {
    System.out.println("Please enter a valid number!");
}catch (Exception e) {
    System.out.println("Invalid input, please try again!");
}
*/



/* 14. Write a Java program that reads an integer and check whether it is
negative, zero, or positive.
Test Data
Input a number: 7
Expected Output :
Number is positive */

     /*
       int number=0;
        boolean validinput =false;

        do{
            try {


                System.out.print("Please enter a number: ");
                number = input.nextInt();


                if (number > 0) {
                    System.out.println("Number is positive");
                } else if (number < 0) {

                    System.out.println("Number is negative");
                } else {
                    System.out.println("Number is zero");
                    ;
                }


            }catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid number!");
            }catch(Exception e) {
                System.out.println("Something went wrong, please try again!");
            }
            break;
        } while(!validinput);
*/



    } //End of main


//Q3
  public static void validateRadius(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception ("Invalid,Radius cannot be Negative!");
        }
  }

  public static void checkAverage (int countnumbers) throws Exception {
        if (countnumbers == 0) {
            throw new Exception ("Invalid,Average cannot be Zero!");
        }
  }
 // Q6
  public static void empty (String word) throws Exception {
        if (word.length() == 0) {
            throw new Exception ("Empty String! Please Try again with a word to reverse:)");
        }

  }


}