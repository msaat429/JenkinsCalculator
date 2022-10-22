import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command:");

        String request = scan.next();

        while(true) {
            if (request.equals("add")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(calculator.add(a, b));
            } else if (request.equals("subtract")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(calculator.subtract(a, b));
            } else if (request.equals("binary")) {
                int a = scan.nextInt();
                System.out.println(calculator.intToBinaryNumber(a));
            } else if (request.equals("fibonacci")) {
                int a = scan.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(a));
            } else if (request.equals("multiply")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(calculator.multiply(a, b));
            } else if (request.equals("divide")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(calculator.divide(a, b));
            }
            else if (request.equals("exit")) {
                break;
            }

            request = scan.next();
        }
    }
}
