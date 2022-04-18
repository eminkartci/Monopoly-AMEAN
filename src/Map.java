
public class Map {

	public static void main(String[] args) {

		Map m = new Map(7, 5);

		m.showMap();

	}

	// Constants
	private int CARD_WIDTH = 5, CARD_HEIGHT = 5;

	// Attributes
	private int width, height;
	private EstateCard[] estateMap;

	// Constructor
	public Map(int width, int height) {

		this.width = width;
		this.height = height;
		this.estateMap = new EstateCard[2 * width + 2 * height - 4];

	}

	// Behaviour
	public void showMap() {

		// Purpose
		/*
		 * ---- ---- ---- ---- // TOP PART | | | | | // MIDDLE PART | | | | | // MIDDLE
		 * PART ---- ---- ---- ---- // BOTTOM PART
		 */

		for (int height = 0; height < this.height; height++) {

			// Check if this is the first or last row
			if (height == 0 || height == this.height - 1) {

				// TOP PART
				// ---- ----
				for (int w = 0; w < this.width; w++) {
					System.out.print("  ");
					for (int i = 0; i < CARD_WIDTH; i++) {
						System.out.print("-");
					}

				}

				System.out.print("\n ");

				// MIDDLE PART
				for (int h = 0; h < this.CARD_HEIGHT - 2; h++) {

					for (int w = 0; w < this.width; w++) {

						System.out.print("|");

						for (int i = 0; i < CARD_WIDTH; i++) {
							System.out.print(" ");
						}

						System.out.print("|");

					}

					System.out.print("\n ");

				}

				// Bottom PART
				// ---- ---- ---- ---- ----
				for (int w = 0; w < this.width; w++) {
					System.out.print(" ");
					for (int i = 0; i < CARD_WIDTH; i++) {
						System.out.print("-");
					}
					System.out.print(" ");

				}
				System.out.println("");

			} else { // Otherwise - Middle Rows

				// TOP PART
				// ---- ---- ---- ---- ----
				for (int w = 0; w < this.width; w++) {
					System.out.print("  ");
					// check if this is first card or last card
					if (w == 0 || w == this.width - 1) {
						for (int i = 0; i < CARD_WIDTH; i++) {
							System.out.print("-");
						}
					} else { // Middle Part
						// Print space " "
						for (int i = 0; i < CARD_WIDTH; i++) {
							System.out.print(" ");
						}
					}

				}
				System.out.print("\n ");

				// MIDDLE PART
				for (int h = 0; h < this.CARD_HEIGHT - 2; h++) {

					for (int w = 0; w < this.width; w++) {
						// check if this is first card or last card
						if (w == 0 || w == this.width - 1) {
							System.out.print("|");

							for (int i = 0; i < CARD_WIDTH; i++) {
								System.out.print(" ");
							}

							System.out.print("|");

						} else {// Middle Part
							
							System.out.print(" ");

							for (int i = 0; i < CARD_WIDTH; i++) {
								System.out.print(" ");
							}

							System.out.print(" ");

						}

					}

					System.out.print("\n ");

				}

				// Bottom PART
				// ---- ---- ---- ---- ----
				for (int w = 0; w < this.width; w++) {
					System.out.print(" ");
					// check if this is first card or last card
					if (w == 0 || w == this.width - 1) {
						for (int i = 0; i < CARD_WIDTH; i++) {
							System.out.print("-");
						}
						System.out.print(" ");
					} else { // Middle Part
						// Print space " "
						
						for (int i = 0; i < CARD_WIDTH; i++) {
							System.out.print(" ");
						}
						System.out.print(" ");
					}

				}
				System.out.println("");

			}

		}

	}

	// GETTER SETTER

}
