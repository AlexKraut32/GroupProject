public class task1 {

        public static void main(String[] args) {

            identify(6);

        }

        public static void identify(int num){

            if(num % 2 == 0){ // if given number divides by 2 with no remainder

                System.out.println("Even"); // num is even

            }else{ //if given number divides by 2 WITH remainder

                System.out.println("Odd"); // num is odd
            }
        }
    }
/*
Write a method which identifies whether the given number is even or odd

    EX:

        identify(5) -> "Odd"
        identify(6) -> "Even"
 */

}
