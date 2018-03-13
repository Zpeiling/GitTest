package come.tiedao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tiedao.dao.UserDao;
import com.tiedao.pojo.User;
import com.tiedao.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {
	@Resource  
	private UserDao userDao; 
	
	public List<User> selectAll()
	{
		try {
			return this.userDao.selectAll(); 			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		return null;
	}	
	public User getUserById(Integer userId) {  
		User user=null;
		try 
		{
			user= this.userDao.selectByPrimaryKey(userId); 
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}	     
	    return user;
	}
	/////////////新加的方法////////////////////
	public User getUserByName(String username) {
		User userName=null;
		try 
		{
			userName= this.userDao.findUserByName(username); 
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}	     
	    return userName;		
	}	
	@Override
	public User checkLogin(String username, String password) {
		//根据用户名实例化用户对象
        User user = userDao.findUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
	}
	///////////////////////////////////
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}