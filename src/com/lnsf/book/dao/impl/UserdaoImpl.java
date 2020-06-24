
package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IUserdao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.User;

public class UserdaoImpl implements IUserdao {

	//对User表进行查询
	@Override
	public List<User> select() {
		ResultSet rs = null;
		List<User> list = new ArrayList<User>();
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("select * from user");){

			rs = prep.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("name"),
						rs.getInt("identify"), rs.getString("username"),
						rs.getString("password"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//对User表进行插入
	@Override
	public boolean insert(User user) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("insert into User values(null, ?, ?, ?, ?)");){
			prep.setString(1, user.getName());
			prep.setInt(2, user.getIdentify());
			prep.setString(3, user.getUsername());
			prep.setString(4, user.getPassword());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	//对User表进行更新
	@Override
	public boolean update(User user) {
		boolean flag = false;
		try (Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("update User set name = ?, identify = ? ,username = ? ,"
					+ " password = ? where id = ?");){
			prep.setString(1, user.getName());
			prep.setInt(2, user.getIdentify());
			prep.setString(3, user.getUsername());
			prep.setString(4, user.getPassword());
			prep.setInt(5, user.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	//对User表进行删除
	@Override
	public boolean delete(User user) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("delete from user where id = ?");){
			prep.setInt(1, user.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}