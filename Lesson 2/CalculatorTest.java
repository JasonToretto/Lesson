import java.util.Scanner;

	public class Calculator {
    	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
        	Calculator calculator = new Calculator();
        	String answer;

            do {    
                System.out.println("Введите одну из математических операций");
                calculator.setInputExpression(scan.nextLine());
                calculator.calculate();

            do {
                System.out.println("Вы хотите продолжить?: ");
                  answer = scan.nextLine();
                } while (!answer.equals("да") && !answer.equals("нет"));
                  
            } while(!answer.equals("нет"));
        }
    }  
