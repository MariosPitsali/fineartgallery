package gallery_classes;

public class Photo {

	//class attribute declaration

	private static int counter=0;
	private int photoID;
	private String category;
	private int year;
	private String place;
	private String url;
	private double price;

	//class constructor

	public Photo(int id, String category, int year, String place, String url, double price){

		this.category = category;
		this.year = year;
		this.place = place;
		this.url = url;
		this.price = price;
		photoID = id;


	}
	//getters

	public int getPhotoId(){
		return photoID;
	}

	public String getCategory(){
		return category;
	}

		public int getYear(){
			return year;
		}

		public String getPlace(){
			return place;
		}

		public String getUrl(){
			return url;
		}

		public double getPrice(){
			return price;
	}

}