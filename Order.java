package gallery_classes;

public class Order {

	private int orderNO;
	private int userID;
	private double value;
	private boolean isCart;

	//class constructor
	public Order(int orderNO, int userID, double value){
		this.orderNO = orderNO;
		this.userID = userID;
		this.value = value;
		isCart = false;

	}

	//getters and setters

	public void setOrderNo(int orderNO){
		this.orderNO = orderNO;
	}

	public void setUserID(int userID){
		this.userID = userID;
	}

	public void setValue(double value){
		this.value = value;
	}

	/*changes isCart to true if it is not, and vice versa
	this way a Cart is converted to a confirmed Order*/
	public void changeStatus(){
		if (this.isCart){
			this.isCart = false;
		} else{
			this.isCart = true;
		}
	}

	public int getOrderNO(){
		return orderNO;
	}

	public int getUserID(){
		return userID;
	}

	public double getValue(){
		return value;
	}

	public boolean getStatus(){
		return isCart;
	}


}