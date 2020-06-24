
package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IRestaurantdao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Restaurant;

public class RestaurantdaoImpl implements IRestaurantdao{

	@Override
	public List<Restaurant> select() {
		ResultSet rs=null;
		List<Restaurant> list = new ArrayList<Restaurant>();
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("select * from Restaurant");){

			rs = prep.executeQuery();
			while(rs.next())
			{
				Restaurant restaurant = new Restaurant(rs.getInt("id"), rs.getInt("userid"), 
						rs.getString("name"), rs.getString("address"));
				list.add(restaurant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Restaurant restaurant) {
		boolean flag = false;
		try (Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("insert into Restaurant values(null, ?, ?, ?)");){
			prep.setInt(1, restaurant.getUserid());
			prep.setString(2, restaurant.getName());
			prep.setString(3, restaurant.getAddress());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Restaurant restaurant) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("update Restaurant set userid = ? , name = ? ,"
					+ "address = ? where id = ?");){
			prep.setInt(1, restaurant.getUserid());
			prep.setString(2, restaurant.getName());
			prep.setString(3, restaurant.getAddress());
			prep.setInt(4, restaurant.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Restaurant restaurant) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("delete from Restaurant where id = ?");){
			prep.setInt(1, restaurant.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}