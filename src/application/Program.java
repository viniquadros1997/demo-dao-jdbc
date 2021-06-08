package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 2000.0, obj);
		System.out.println(seller);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println(seller);
		
		
		
		
	}

}
