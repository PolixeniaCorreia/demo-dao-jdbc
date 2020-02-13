package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("**** TESTE 1 : SELLER findById ****");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		System.out.println("**** TESTE 2 : SELLER findByIdDepartment ****");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("**** TESTE 3 : SELLER findAll ****");
		
		list = sellerDao.findAll();
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("**** TESTE 4 : SELLER INSERT ****");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.00,department);
		sellerDao.insert(newSeller);
		System.out.println("Insertd! New Id = "+newSeller.getId());
	}

}
