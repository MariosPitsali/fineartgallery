package gallery_classes;

/* class used to validate parameters
* @ author Group29
*/
public class SearchValidation{


	//default constructor
	public SearchValidation(){

	}

	//used to validate search term
	public boolean isYearValid(String search_term){

		int term;
		try{
			term = Integer.parseInt(search_term);
		}catch(NumberFormatException ex){
			return false; //number is not integer
		}

		if ((search_term.length() < 1) || (search_term.length() > 4)){
			return false; //year is invalid
		}

		return true;



	}
	//used to validate if place search term is valid
	public boolean isPlaceValid(String search_term){

		int place;

		try {
			place = Integer.parseInt(search_term);
		}catch(NumberFormatException e){
			return true;}

		if (search_term.length() < 2){
			return false;
		}

		return true;

	}
	/*used to validate if username is valid
	*uname must contain only numbers and letters
	*and must not be shorter than 6 characters
	*/
	public boolean isUsernameValid(String uname){

		if ((uname.matches("[a-zA-Z0-9]*")) && (uname.length()>6)){
			return true;
		}

		return false;
	}

	/*used to validate if name is valid
	*name must be longer than 2 characters
	*/
	public boolean isNameValid(String name){

		if ((name.length() <= 2) || (name==null)){
			return false;
		}

		return true;


	}

	public boolean isValidEmailAddress(String email) {


	        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
	        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
	        java.util.regex.Matcher m = p.matcher(email);

	        return m.matches();
	}

	public boolean isValidPhoneNumber(String phone) {

			if( phone == null || phone.length() != 10) {

				return false;
			}

			try {

				Long.parseLong(phone);

			} catch (NumberFormatException e) {

				return false;
			}

			if (!(phone.startsWith("210") || phone.startsWith("69"))){
				return false;
			}

			return true;
	}



}