package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("**** TESTE 1 : DEPARTMENT INSERT ****");
		Department depNew = new Department(null,"D3");
		depDao.insert(depNew);
		System.out.println("Insertd! New Id = "+depNew.getId());
		
	}

}
