package gallery_classes;
import java.util.*;
import java.sql.*;

public class PhotoDAO{


	//default class constructor
	public PhotoDAO(){

	}

	//returns a list containing all Photo Objects
	public List<Photo> getPhotos() throws Exception {

		List <Photo> photos = new ArrayList <Photo>();



		Database db = new Database();
		db.open();
		Connection con = db.getConnection();

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM photo ;";//query to fetch all photos in Database
		try {
			stmt = con.prepareStatement(sql); //initialize stmt
			rs = stmt.executeQuery(); //execute (SQL Statement) sql
			while (rs.next()){
				photos.add(new Photo(rs.getInt("photoID"), rs.getString("Category"), rs.getInt("YearTaken"), rs.getString("Place"), rs.getString("url"), rs.getDouble("Price")));


			}
			stmt.close(); //close Statement stmt4
		} catch (SQLException e) {
			throw new Exception("Could not execute Database Query");
		}

		//close Database Connection
		db.close();
		//return <Photo> List
		return photos;

	}

	public Photo getPhotoByID(int photo_id) throws Exception {


		try {
			List <Photo> photos = getPhotos();


			for (Photo photo: photos){
				if (photo.getPhotoId() == photo_id){
					return photo;
				}
			}
		}catch (Exception ex){
			throw new Exception (ex.getMessage());
		}

		return null;

	}

	public List<Photo> getPhotoByYear(int year) throws Exception{

		List <Photo> photoyear = new ArrayList<Photo>();
		try {
			List <Photo> photos = getPhotos();


			for (Photo photo: photos){
				if (photo.getYear() == year){
					photoyear.add(photo);
				}
			}
		}catch (Exception ex){
			throw new Exception (ex.getMessage());
		}

		return photoyear;

	}

	public List<Photo> getPhotoByPlace(String place) throws Exception{

			List <Photo> photoplace = new ArrayList<Photo>();
			try {
				List <Photo> photos = getPhotos();


				for (Photo photo: photos){
					if (photo.getPlace() == place){
						photoplace.add(photo);
					}
				}
			}catch (Exception ex){
				throw new Exception (ex.getMessage());
			}

			return photoplace;

	}





}