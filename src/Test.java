import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        String s = "Facebook.com \n JavaTpoint.com 22 60.0";
        //Create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);
        //Find the next token and print it
        System.out.print("Token Value1: " + scanner.next());
        System.out.print("\nToken value2: " + scanner.next());
        System.out.println("Delimeter: " + scanner.delimiter() + "!!!");
        scanner.close();

         */
//        int userInput;
//        do {
//            System.out.println("Please enter a number between 1 and 5!");
//            userInput = scan.nextInt();
//            scan.nextLine();
//            System.out.println(userInput);
//            System.out.println(userInput > 5 || userInput < 1);
//        } while (userInput > 5 || userInput < 1);
        int arr1[] = new int[] {1,2,3,4,5,6};
        String hello = "hello world";
        char arr[] = hello.toCharArray();
        assert arr1.length == 5 : "arr1 does not have length 6";
        System.out.println(Arrays.toString(arr));
    }
}

