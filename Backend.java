import java.util.Scanner;

public class file {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Number ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Your Operator (- , + , * , / ) " );
        char operator = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Enter Your Second Number ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

      double result = switch (operator){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Can not divide by 0 so we will give you 0 as a result");
                    System.out.println("Syntax Error");
                    yield Double.NaN ;
                } else {
                   double divide =  num1 / num2;
                    yield divide;
               }
            }
            default -> {
                System.out.println("You should write one of them ( * , + , - , /)");
                System.out.println("Syntax Error");
                yield Double.NaN;
            }
      };

        System.out.printf("Your Result = %.2f" , result);
        scanner.close();
    }
}
