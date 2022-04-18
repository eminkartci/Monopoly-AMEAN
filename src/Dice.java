import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice d1 = new Dice(6);
		Dice d2 = new Dice(8);
		
		System.out.println("Dice 1 Output: " + d1.roll());
		System.out.println("Dice 2 Output: " + d2.roll());

	}
	
	// Attribute
	Random rand;
	int currentValue,previousValue,dice_face_count;
	
	// Constructor
	public Dice(int dice_face_count) {
		this.dice_face_count = dice_face_count;
		
		// Create random object
		this.rand = new Random();
	}
	
	// Roll Function
	public int roll() {
		return this.rand.nextInt(dice_face_count) + 1; // 0 - 1 - 2 --- - Limit
	}

}
