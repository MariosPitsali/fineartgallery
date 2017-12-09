package gallery_classes;

public class User {


	// class attribute declaration

	static int ID_counter = 0; //increments user id

	private int id;
	private String name;
	private String surname;
	private String username;
	private String email;
	private String ship_address;
	private String password;

	//class constructor
	public User (int id, String name, String surname, String username, String password, String email, String ship_address){

		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.ship_address = ship_address;
		this.id = id;


	}
	//get methods for attribute accessibility

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}

	public String getUsername(){
		return username;
	}

	public String getMail(){
		return email;
	}

	public String getShipAddress(){
		return ship_address;
	}

	public void setUsername(String uname){
		username = uname;
	}

	public void setPassword(String pword){
		password = pword;
	}


}