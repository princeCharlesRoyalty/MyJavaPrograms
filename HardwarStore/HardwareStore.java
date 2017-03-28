public class Invoice {
	private String partNumber,partDescription;
	private int itemQuantity;
	private double itemPrice;
	
	Invoice(String pn, String pd,int iq,double ip){
		setNumber(pn);
		setPartDescription(pd);
		setItemQuantity(iq);
		setItemPrice(ip);
	}
	public String getNumber(){
		return this.partNumber;
	}
	public void setNumber(String pn){
		this.partNumber = pn;
	}
	public String getPartDescription(){
		return this.partDescription;
	}
	public void setPartDescription(String pd){
		this.partDescription = pd;
	}
	public int getItemQuantity(){
		return this.itemQuantity;
	}
	public void setItemQuantity(int iq){
		this.itemQuantity = (iq<0)?0:iq;
	}
	public double getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(double p){
		this.itemPrice = (p<0)?0.0:p;
	}
	public double getInvoiceAmount(){
		return this.itemPrice * this.itemQuantity;
	}
}

class TestInvoice {

	public static void main(String[] args) {
		System.out.println("******First Invoice******");
		Invoice firstInvoice = new Invoice("1","Itel 1239 v3",3,200.0);
		System.out.println("Number: "+firstInvoice.getNumber());
		System.out.println("Part Description: "+firstInvoice.getPartDescription());
		System.out.println("Quantity of Items Purchased: "+firstInvoice.getItemQuantity());
		System.out.println("Price per item: "+firstInvoice.getItemPrice());
		System.out.println("Invoice Amount: "+firstInvoice.getInvoiceAmount());
		System.out.println();
		
		System.out.println("******Second Invoice with negative inputs ******");
		Invoice secondInvoice = new Invoice("2","Toshiba 238 HD",-7,-2.0);
		System.out.println("Number: "+secondInvoice.getNumber());
		System.out.println("Part Description: "+secondInvoice.getPartDescription());
		System.out.println("Quantity of Items Purchased: "+secondInvoice.getItemQuantity());
		System.out.println("Price per item: "+secondInvoice.getItemPrice());
		System.out.println("Invoice Amount: "+secondInvoice.getInvoiceAmount());
		System.out.println();
		
		System.out.println("******Second Invoice with negative inputs changed ******");
		secondInvoice.setItemPrice(126.50);
		secondInvoice.setItemQuantity(13);
		System.out.println("Number: "+secondInvoice.getNumber());
		System.out.println("Part Description: "+secondInvoice.getPartDescription());
		System.out.println("Quantity of Items Purchased: "+secondInvoice.getItemQuantity());
		System.out.println("Price per item: "+secondInvoice.getItemPrice());
		System.out.println("Invoice Amount: "+secondInvoice.getInvoiceAmount());

	}

}
