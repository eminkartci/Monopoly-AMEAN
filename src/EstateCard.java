
public class EstateCard extends Card{

	public EstateCard(int card_id, String title) {
		super(card_id, title);
		// TODO Auto-generated constructor stub
	}
	
	public EstateCard(int card_id, String title,String city,int position,double price) {
		this(card_id,title);
		this.city 			= city;
		this.position 		= position;
		this.price 			= price;
		this.isSold 		= false;
		this.houseCount 	= 0;
		this.cardStr 		= getCardStr();
	}
	
	// Attributes
	String city;
	int houseCount,position;
	double price;
	boolean isSold;
	
	// Behaviours
	public String getCardStr() {
		String content =  		"\n- "+this.title+"\t- " + "\n" +
					"|               |" + "\n" +
					"| City: "+this.city+"\t|"+ "\n" +
					"| Sold: "+this.isSold+"\t|"+ "\n" +
					"| House: "+this.houseCount+"\t|"+ "\n" +
					"| Price: "+this.price+"|"+ "\n" +
					"| Position: "+this.position+"\t|"+ "\n" +
					"|               |" + "\n" +
					"|               |" + "\n" +
					"|               |" + "\n" +
					"----------------- " + "\n\n" ;
		
		return content;
	}
	
	public String getCardInfo() {
		return "Value " + this.value;
	}
	

}
