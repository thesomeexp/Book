
package com.lnsf.book.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnsf.book.dao.IAppraisedao;
import com.lnsf.book.dbutils.DButil;
import com.lnsf.book.model.Appraise;

public class AppraisedaoImpl implements IAppraisedao{

	@Override
	public List<Appraise> select() {
		ResultSet rs=null;
		List<Appraise> list = new ArrayList<Appraise>();
		try (
			Connection conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("select * from Appraise");){
			rs = prep.executeQuery();
			while(rs.next())
			{
				Appraise appraise = new Appraise(rs.getInt("uid"), rs.getInt("rid"), rs.getString("about"));
				list.add(appraise);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Appraise appraise) {
		boolean flag = false;
		try (
				Connection conn = DButil.getConnection();
				PreparedStatement prep = conn.prepareStatement("insert into Appraise values(?, ?, ?)");){

			prep.setInt(1, appraise.getUid());
			prep.setInt(2, appraise.getRid());
			prep.setString(3, appraise.getAbout());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Appraise appraise) {
		boolean flag = false;
		try(
			 	Connection conn = DButil.getConnection();
				PreparedStatement prep = conn.prepareStatement("update Appraise set about = ? where uid = ? "
						+ "and rid = ?");) {

			prep.setString(1, appraise.getAbout());
			prep.setInt(2, appraise.getUid());
			prep.setInt(3, appraise.getRid());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(Appraise appraise) {
		boolean flag = false;
		try(	
				Connection	conn = DButil.getConnection();
			PreparedStatement prep = conn.prepareStatement("delete from Appraise where uid = ? and rid = ?");) {

			prep.setInt(1, appraise.getUid());
			prep.setInt(2, appraise.getRid());
			prep.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}