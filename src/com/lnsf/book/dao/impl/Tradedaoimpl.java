
package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.ITradedao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Trade;

public class Tradedaoimpl implements ITradedao{

	@Override
	public List<Trade> select() {
		ResultSet rs=null;
		List<Trade> list = new ArrayList<Trade>();
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("select * from Trade");){
			rs = prep.executeQuery();
			while(rs.next())
			{
				Trade trade = new Trade(rs.getInt("id"), rs.getInt("userid"),
						rs.getString("usertele"), rs.getInt("rid"), rs.getString("status"),
						rs.getString("address"), rs.getInt("money"));
				list.add(trade);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Trade trade) {
		boolean flag = false;
		try (Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("insert into Trade values(null, ?, ?, ?, ?, ?, ?)");){
			prep.setInt(1, trade.getUserid());
			prep.setString(2, trade.getUsertele());
			prep.setInt(3, trade.getRid());
			prep.setString(4, trade.getStatus());
			prep.setString(5, trade.getAddress());
			prep.setInt(6, trade.getMoney());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Trade trade) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("update Trade set usertele = ?,"
					+ " status = ?, address = ?, money = ? where id = ?");){
			prep.setString(1, trade.getUsertele());
			prep.setString(2, trade.getStatus());
			prep.setString(3, trade.getAddress());
			prep.setInt(4, trade.getMoney());
			prep.setInt(5, trade.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Trade trade) {
		boolean flag = false;
		try (			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("delete from Trade where id = ?");){
			prep.setInt(1, trade.getId());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}