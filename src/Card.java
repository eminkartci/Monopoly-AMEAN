
public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(1,"Fortune");
		c.showCard();
		
		EstateCard ec = new EstateCard(2,"Estate Card","Antalya",1,10000);
		ec.showCard();

	}
	
	// CONSTANT
	
	// Attribute
	int card_id;
	String title,cardStr;
	double value;
	
	// Constructor
	public Card(int card_id,String title) {
		
		this.card_id 	= card_id;
		this.title 		= title;
		this.value		= 0;
		this.cardStr 	= getCardStr();
	}
	
	// Behaviour
	public void showCard() {
		
		System.out.println(this.cardStr);
		
	}
	
	public String getCardStr() {
		String content =  		"- "+this.title+"\t- " + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"|                |" + "\n" +
					"------------------ " + "\n" ;
		
		content += getCardInfo();
		
		return content;
	}
	
	public String getCardInfo() {
		return "Value " + this.value;
	}
	
	
	// GETTER SETTER

}
