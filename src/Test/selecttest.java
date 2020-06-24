
package Test;

import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.dao.impl.UserdaoImpl;

public class selecttest {
	
	public static void main(String[] args) {
		UserdaoImpl userdao = new UserdaoImpl();
		//System.out.println(userdao.select());
		
		TypedaoImpl typedao = new TypedaoImpl();
		//System.out.println(typedao.select());
		
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		//System.out.println(restaurantdao.select());
		
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		System.out.println(appraisedao.select());
		
		MenudaoImpl menudao = new MenudaoImpl();
		//System.out.println(menudao.select());
		
		Tradedaoimpl tradedao = new Tradedaoimpl();
		//System.out.println(tradedao.select());
		
		CardaoImpl cardao = new CardaoImpl();
		//System.out.println(cardao.select());
	}
}