
package Test;

import com.lnsf.book.dao.impl.AppraisedaoImpl;
import com.lnsf.book.dao.impl.CardaoImpl;
import com.lnsf.book.dao.impl.MenudaoImpl;
import com.lnsf.book.dao.impl.RestaurantdaoImpl;
import com.lnsf.book.dao.impl.Tradedaoimpl;
import com.lnsf.book.dao.impl.TypedaoImpl;
import com.lnsf.book.dao.impl.UserdaoImpl;
import com.lnsf.book.model.Appraise;
import com.lnsf.book.model.Car;
import com.lnsf.book.model.Menu;
import com.lnsf.book.model.Restaurant;
import com.lnsf.book.model.Trade;
import com.lnsf.book.model.Type;
import com.lnsf.book.model.User;

public class updatetest {
	
	public static void main(String[] args) {
		UserdaoImpl userdao = new UserdaoImpl();
		//userdao.update(new User(7,"user77",17,"user77","user77"));
		
		TypedaoImpl typedao = new TypedaoImpl();
		//typedao.update(new Type(5,"牛杂类"));
		
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		//restaurantdao.update(new Restaurant(6, 5, "糖水铺", "北街"));
		
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		//appraisedao.update(new Appraise(5,4,"6666"));
		
		MenudaoImpl menudao = new MenudaoImpl();
		//menudao.update(new Menu(6, "烤鸡翅", 20, 5, "好香", 1));
		
		Tradedaoimpl tradedao = new Tradedaoimpl();
		tradedao.update(new Trade(5, 6, "1533333334", 4, "未付款", "玲使" ,-1));
		
		CardaoImpl cardao = new CardaoImpl();
		//cardao.update(new Car(5, 5, 3, 4));
	}
}