
package Test;

import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.Car;

public class deletetest {
	public static void main(String[] args) {
		
		UserdaoImpl userdao = new UserdaoImpl();
		//userdao.delete(new User(7,"user7",1,"user7","user7"));
		
		TypedaoImpl typedao = new TypedaoImpl();
		//typedao.delete(new Type(5,"牛杂类"));
		
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		//restaurantdao.delete(new Restaurant(6, 5, "糖水铺", "哪里"));
		
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		//appraisedao.delete(new Appraise(5,4,"666"));
		
		MenudaoImpl menudao = new MenudaoImpl();
		//menudao.delete(new Menu(6, "烤鸡翅", 20, 5, "好香", 1));
		
		Tradedaoimpl tradedao = new Tradedaoimpl();
		//tradedao.delete(new Trade(5, 6, "1533333333", 4, "未付款", "玲使" ,-1));
		
		CardaoImpl cardao = new CardaoImpl();
		cardao.delete(new Car(5, 5, 5, 4));
	}
}
