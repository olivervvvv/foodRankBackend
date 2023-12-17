package com.twoTeam.groupProject;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.twoTeam.groupProject.Vo.StoreInfoReq;
import com.twoTeam.groupProject.Vo.StoreInfoRes;
import com.twoTeam.groupProject.constants.RtnCode;
import com.twoTeam.groupProject.constants.UserRoles;
import com.twoTeam.groupProject.entity.StoreInfo;
import com.twoTeam.groupProject.entity.UsersEntity;
import com.twoTeam.groupProject.repository.UserDao;
import com.twoTeam.groupProject.repository.storeInfoDao;

@SpringBootTest
class GroupProjectApplicationTests {

	@Autowired
	private storeInfoDao storeInfoDao;
	
	@Autowired
	private UserDao userDao;
	
	@Test
	void contextLoads() {
		
	}

//    @Transactional
//    @Rollback(false) // 可以取消回滾，確保測試中的數據儲存到數據庫中
	@Test
    public void testSetUserList() {
		// 準備測試數據
		String locationCity = "台中市";
		List<StoreInfo> storeInfoList = storeInfoDao.findByLocationCity(locationCity);
		
		 // 判斷結果是否符合預期
//        if (storeInfoList.isPresent()) {
		// 判斷結果是否符合預期
	    if (storeInfoList != null && !storeInfoList.isEmpty()) {
	    	for (StoreInfo storeInfo : storeInfoList) {

	    		System.out.println(storeInfo.getFoodStyle());
	        }
        } else {
            System.out.println("未找到相應的StoreInfo");
        }
        System.out.println("============================");
		System.out.println(storeInfoList);
	}
	
	@Test
	public StoreInfoRes CreateStoreInfo() {
			String name="";
			String address=""; 
			String locationCity="台中市"; 
			String foodStyle="韓國料理";
			LocalDateTime updateTime;
//		for (StoreInfo storeInfo : req.getStoreInfoList()) {
//			System.out.println("=============");
//			System.out.println(storeInfo.getName());
//			System.out.println("=============");
//		}
			return null;
		

//	        setUpdateTime(LocalDateTime.now());

//	    List<StoreInfo> savedStoreInfoList = storeInfoDao.saveAll(req.getStoreInfoList());
	    // Return success response
//	    return new StoreInfoRes(savedStoreInfoList,RtnCode.SUCCESSFUL);
	}
	
	@Test
	public void createuser() {
		UsersEntity usersEntity = new UsersEntity();
        usersEntity.setEmail("djdj@kimo.com");
        usersEntity.setName("測試人員一");
        usersEntity.setPassword("dsd");
//        usersEntity.setRole(UserRoles.NORMAL);
        userDao.save(usersEntity);
		
	}
}
