package application;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);

		System.out.println("**** TESTE 1 : DEPARTMENT INSERT ****");
		Department depNew = new Department(null,"D3");
		depDao.insert(depNew);
		System.out.println("Insertd! New Id = "+depNew.getId());

		System.out.println("**** TESTE 2 : findById  ****");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println();
		System.out.println("**** TESTE 3 : DEPARTMENT UPDATE ****");
		Department dep2 = depDao.findById(1);
		dep2.setName("DepartamentoD1");
		depDao.update(dep2);
		System.out.println("Atualizado");

		System.out.println("**** TESTE 4 : DEPARTMENT DELETE ****");
		System.out.print("Digite um id para deletar : ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Deletado com sucesso!!");

	}

}


