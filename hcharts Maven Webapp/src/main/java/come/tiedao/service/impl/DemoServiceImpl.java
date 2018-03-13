package come.tiedao.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tiedao.dao.DemoDao;
import com.tiedao.dao.UserDao;
import com.tiedao.pojo.Demo;
import com.tiedao.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{
	@Resource  
	private DemoDao demoDao;
	
	@Override
	public List<Demo> selectAll()
	{
		try {
			return this.demoDao.selectAll(); 			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		return null;
	}
	
    @Override
	public Demo getDemoById(int demoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Demo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
