package aplicação;

import java.util.Date;

import model.entidades.Department;
import model.entidades.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1,"books");
		
		
		
		Seller seller = new Seller (21,"bob","ddandre1010@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);

	}

}
