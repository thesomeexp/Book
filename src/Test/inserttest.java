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

public class inserttest {
	
	public static void main(String[] args) {
		UserdaoImpl userdao = new UserdaoImpl();
		//userdao.insert(new User(7,"",1,"user7","user7"));

		TypedaoImpl typedao = new TypedaoImpl();
		//typedao.insert(new Type(-1,"",0));
		
		RestaurantdaoImpl restaurantdao = new RestaurantdaoImpl();
		//restaurantdao.insert(new Restaurant(6, 5, "糖水铺", "哪里"));
		
		AppraisedaoImpl appraisedao = new AppraisedaoImpl();
		//appraisedao.insert(new Appraise(5,4,"666"));
		
		MenudaoImpl menudao = new MenudaoImpl();
		//menudao.insert(new Menu(6, "烤鸡翅", 20, 5, "好香", 1));
		
		Tradedaoimpl tradedao = new Tradedaoimpl();
		//tradedao.insert(new Trade(5, 6, "1533333333", 4, "未付款", "玲使" ,-1));
		
		CardaoImpl cardao = new CardaoImpl();
		//cardao.insert(new Car(5, 5, 5, 4));
	}
}
