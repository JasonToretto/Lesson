public class Calculator {

private String inputExpression;

    void setInputExpression(String inputExpression) {
        this.inputExpression = inputExpression;
    }

    public void calculate() {
        String[] mathExpression = inputExpression.split(" ");
        int number1 = Integer.parseInt(mathExpression[1]);
        int number2 = Integer.parseInt(mathExpression[2]);

        switch (mathExpression[1]) {
            case "+":
                System.out.println(Math.addExact(number1, number2));
                break;
            case "-":
                System.out.println(Math.subtractExact(number1, number2));
                break;
            case "*":
                System.out.println(Math.multiplyExact(number1, number2));
                break;
            case "/":
                System.out.println((float) number1 / number2);
                break;
            case "%":
                System.out.println(Math.floorMod(number1, number2));
                break;
            case "^":
                System.out.println(Math.pow(number1, number2));
                break;
            default:
                System.out.println("Это выражение не работает!!");
        }
    }
}