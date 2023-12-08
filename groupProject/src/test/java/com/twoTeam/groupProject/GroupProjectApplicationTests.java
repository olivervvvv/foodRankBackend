package com.twoTeam.groupProject;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.twoTeam.groupProject.entity.StoreInfo;
import com.twoTeam.groupProject.repository.storeInfoDao;

@SpringBootTest
class GroupProjectApplicationTests {

	@Autowired
	private storeInfoDao storeInfoDao;
	
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
}
