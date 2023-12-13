package com.jsp.expensetracker.entity;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.expensetracker.dao.UserDao;
import com.jsp.expensetracker.utility.SingletonClass;
import java.sql.Blob;
public class UserDaoImpl implements UserDao {

	
	private Connection connect=SingletonClass.getSingletonClassObject().getConnect();
	private PreparedStatement pstmt;
	@Override
	public int register(User user) throws Exception  {
		// TODO Auto-generated method stub
		String insert="insert into user"
				+"(username,fullname,email,mobile,password)"
				+"values(?,?,?,?,?)";
		
			pstmt=connect.prepareStatement(insert);
		
		pstmt=connect.prepareStatement(insert);
		pstmt.setString(1,user.getUsername());
		pstmt.setString(2, user.getFullname());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getMobile());
		pstmt.setString(5,user.getPassword());
		int status=pstmt.executeUpdate();
		System.out.println("STATUS OF QUERY ="+status);
		if(status!=0)
		{
			String select="select userId from user where email=?";
			pstmt=connect.prepareStatement(select);
			pstmt.setString(1,user.getEmail());
			ResultSet rs=pstmt.executeQuery();
			if(rs.isBeforeFirst())
			{
				rs.next();
				System.out.println("USER ID "+rs.getInt("userId"));
				return rs.getInt("userId");
			}
			
		}
		return 0;
	}
	@Override
	public User login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		
		String query="select * from user where username=? and password=?";
		pstmt=connect.prepareStatement(query);
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			String un=rs.getString("username");
			String email=rs.getString("email");
			String mobile=rs.getString("mobile");
			String fullname=rs.getString("fullname");
			String pwd=rs.getString("password");
			int uid=rs.getInt("userId");
			
			User user=new User();
			user.setEmail(email);
			user.setFullname(fullname);
			user.setMobile(mobile);
		user.setPassword(pwd);
		user.setUsername(username);
		user.setUserId(uid);
		return user;
		}
		return null;
	}
	
	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		String query="select * from user where userId=?";
		pstmt=connect.prepareStatement(query);
		pstmt.setInt(1,id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			String un=rs.getString("username");
			String email=rs.getString("email");
			String mobile=rs.getString("mobile");
			String fullname=rs.getString("fullname");
			String pwd=rs.getString("password");
			int uid=rs.getInt("userId");
			
			User user=new User();
			
			user.setEmail(email);
			user.setFullname(fullname);
			user.setMobile(mobile);
			user.setPassword(pwd);
			user.setUsername(un);
			user.setUserId(uid);
		return user;
		}
		return null;
	}
	@Override
	public String forgotPassword(String email) throws Exception {
		// TODO Auto-generated method stub
		
		String query="select password from user where email=?";
		pstmt=connect.prepareStatement(query);
		pstmt.setString(1,email);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			return rs.getString("password");
		}
		return null;
	}
	
	
	
	@Override
	public int updateUserInfo(User user, int userId) throws Exception {
		// TODO Auto-generated method stub
		
		String query="update user set username=?,fullname=?,email=?,mobile=?,password=? where userId=?";
		
		pstmt=connect.prepareStatement(query);
		
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2,user.getFullname());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getMobile());
		pstmt.setString(5, user.getPassword());
		pstmt.setInt(6, userId);
		int result=pstmt.executeUpdate();
		System.out.println("method check"+result);
		return result;
	}
	
	
	@Override
	public int updateUserProfile(User user, InputStream is) throws Exception {
		// TODO Auto-generated method stub
		
		String query="update user set fullname=?,username=?,mobile=?,email=?,password=?,image=? where userId=?";
		
		pstmt=connect.prepareStatement(query);
		pstmt.setString(1, user.getFullname());
		pstmt.setString(2, user.getUsername());
		pstmt.setString(3, user.getMobile());
		pstmt.setString(4,user.getEmail());
		pstmt.setString(5, user.getPassword());
		pstmt.setBlob(6, is);
		pstmt.setInt(7, user.getUserId());
		
		int status=pstmt.executeUpdate();
		System.out.println(status +"user profile");
		return status;
	}
	@Override
	public int addFeedback(String username, String email, String comment) throws Exception {
		// TODO Auto-generated method stub
		
		String query="insert into contactus (username,email,comment) values (?,?,?)";
		
		
		
	pstmt=connect.prepareStatement(query);
		
		pstmt.setString(1,username);
		pstmt.setString(2,email);
		pstmt.setString(3,comment);
		
		int status=pstmt.executeUpdate();
		return status;
	}
	
	
	
	@Override
	public byte[] getUserProfileImage(int userId) throws Exception {
		// TODO Auto-generated method stub
		
		String query = "select * from user where userId = ?";
		pstmt = connect.prepareStatement(query);
		pstmt.setInt(1, userId);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.isBeforeFirst()) {
			rs.next();
			Blob blob = rs.getBlob("image");
			if(blob != null) {
			byte byteArray[] = blob.getBytes(1, (int)blob.length());
			return byteArray;
			}
		}
		return null;
	}

	

	
}
