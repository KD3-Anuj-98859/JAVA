package assignment7b;

public class CircleTest {
    public static void main(String[] args) {
    try {
    	Circle circle=new Circle(12,14,-7);
    	circle.getDiameter();
    	}catch(NegativeDiameterException e) {
    		System.out.println("Message  "+e.getMessage());
    	}
    }
}
