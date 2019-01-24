import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Romeo Blue");

        Scanner input = new Scanner(System.in);
        System.out.print("Write name of Jaeger: ");
        String modelName = input.nextLine();

        switch (modelName) {
            case "Bracer Phoenix":
                System.out.println(jaegerOne.getModelName());
                
                jaegerOne.setMark("Mark-5");
                System.out.println("Mark:" + jaegerOne.getMark());
                
                jaegerOne.setStatus("Destroyed");
                String statusOne = jaegerOne.getStatus();
                System.out.println("Status:" + statusOne);
                
                jaegerOne.setOrigin("Destroyed");
                System.out.println("Origin:" + jaegerOne.getOrigin());
                
                jaegerOne.setHeight(7.68f);
                System.out.println("Height(m):" + jaegerOne.getHeight());
                
                jaegerOne.setWeight(2.128f);
                System.out.println("Weight(kg):" + jaegerOne.getWeight());
                break;
            case "Romeo Blue":                
                System.out.println(jaegerTwo.getModelName());

                jaegerTwo.setMark("Mark-1");
                System.out.println("Mark:" + jaegerTwo.getMark());

                jaegerOne.setStatus("Destroyed");
                String statusTwo = jaegerTwo.getStatus();
                System.out.println("Status:" + statusTwo);
                break;
            default:
                System.out.println("Error!!");
        }
    }
}
