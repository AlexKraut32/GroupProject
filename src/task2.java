public class task2 {

    public static void main(String[] args) {

        divides(10,2);

    }

    public static void divides(int num1, int num2) {
        if(num2 == 0) { // if num2 equals 0, while loop will be infinite loop
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divide by "+ num2 +" is: ");
        int count = 0;
        while(num1 >= num2) { // while loop will continue until to run until num1 is NOT greater than or equal to num2
            num1 -= num2; //num1 will subtract num2 until it gets to 0. num1 will be reassigned to first number - by 2, and so on
            /*
            10 - 2 = 8; num1 = 8 -> count = 1
            8 - 2 = 6; num1 = 6 -> count = 2
            6 - 2 = 4; num1 = 4 -> count = 3
            4 - 2 = 2; num1 = 2 -> count = 4
            2 - 2 = 0; num1 = 0 -> count = 5 (while loop condition becomes false and will stop)
             */
            count++; //each time num1 subtracts num2, the count will go up. (count will equal 5 because 10 can only subtract 2 5 times).

        }
        System.out.println(count + " and remainder is " + num1);
    }

}
/*

Write a method that can divide two numbers without using the division operator

 */
