package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("=== Test 1 : seller findById ===");
		Seller seller = sellerdao.findById(3);
		
		System.out.println("=== Test 2 : seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== Test 3 : seller findByDepartment ===");
		list = sellerdao.findALL();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		
	}

}
