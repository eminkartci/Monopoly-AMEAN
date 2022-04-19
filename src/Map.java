
public class Map {

	public static void main(String[] args) {

		Map m = new Map(9, 9);
		m.showMap();

	}

	// Constants
	private int CARD_WIDTH = 10, CARD_HEIGHT = 7;

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

		// global variables
		int currentCardIndex = 0;

		// Purpose
		/*
		 * ---- ---- ---- ---- // TOP PART | | | | | // MIDDLE PART | | | | | // MIDDLE
		 * PART ---- ---- ---- ---- // BOTTOM PART
		 */

		// Iterate all rows
		for (int mapRow = 0; mapRow < this.height; mapRow++) {

			// Check if this is the first or last row
			if (mapRow == 0 || mapRow == this.height - 1) {

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
				for (int cardHeight = 0; cardHeight < this.CARD_HEIGHT - 2; cardHeight++) {

					for (int columnIndex = 0; columnIndex < this.width; columnIndex++) {

						System.out.print("|");

						// check if this is the first row and first block
						if (mapRow == 0 && cardHeight == Math.round(this.CARD_HEIGHT / 2) && columnIndex == 0) {
							System.out.print("   START  ");
						} else if (mapRow == 0 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == this.width - 1) {
							System.out.print("   KODES  ");
						} else if (mapRow == this.height - 1 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == 0) {
							System.out.print("   KODES  ");
						} else if (mapRow == this.height - 1 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == this.width - 1) {
							System.out.print("  OTOPARK ");
						} else if (mapRow == 0 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2) - 1) {
							System.out.print("   VERGI  ");
						} else if (mapRow == 0 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2)) {
							System.out.print("KAMU-GEMI ");
						} else if (mapRow == 0 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2) + 1) {
							System.out.print("   ŞANS   ");
						} else if (mapRow == this.height - 1 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2) + 1) {
							System.out.print("   ŞANS   ");
						} else if (mapRow == this.height - 1 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2)) {
							System.out.print("KAMU-UCAK ");
						} else if (mapRow == this.height - 1 && cardHeight == Math.round(this.CARD_HEIGHT / 2)
								&& columnIndex == Math.round(this.width / 2) -1) {
							System.out.print("KAMU-FONU ");
						} else {
							for (int i = 0; i < CARD_WIDTH; i++) {
								System.out.print(" ");
							}
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
				for (int cardHeight = 0; cardHeight < this.CARD_HEIGHT - 2; cardHeight++) {

					for (int columnIndex = 0; columnIndex < this.width; columnIndex++) {
						// check if this is first card or last card
						if (columnIndex == 0 || columnIndex == this.width - 1) {
							System.out.print("|");

							// if this is middle row on the map
							if (mapRow == Math.round(this.height / 2) && columnIndex == 0
									&& cardHeight == Math.round(this.CARD_HEIGHT / 2)) {
								System.out.print(" KAMU-OTO ");
							} else if (mapRow == Math.round(this.height / 2) - 1 && columnIndex == 0
									&& cardHeight == Math.round(this.CARD_HEIGHT / 2)) {
								System.out.print("   ŞANS   ");
							} else if (mapRow == Math.round(this.height / 2) - 1 && columnIndex == this.width - 1
									&& cardHeight == Math.round(this.CARD_HEIGHT / 2)) {
								System.out.print("KAMU-FONU ");
							} else if (mapRow == Math.round(this.height / 2) && columnIndex == this.width - 1
									&& cardHeight == Math.round(this.CARD_HEIGHT / 2)) {
								System.out.print("KAMU-TREN ");
							} else {
								// Otherwise
								for (int i = 0; i < CARD_WIDTH; i++) {
									System.out.print(" ");
								}

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
