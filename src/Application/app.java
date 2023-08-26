package Application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1,"Testes");
		System.out.println(obj);
		
		Seller seller = new Seller(21,"KLINGER TESTE","KLINGERCM@HOTMAIL.COM", new Date(), 15000.0, obj);
		System.out.println(seller);

	}

}
