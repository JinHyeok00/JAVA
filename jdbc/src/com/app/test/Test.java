package com.app.test;

import com.app.dao.UserDAO;
import com.app.domain.UserVO;

public class Test {
   public static void main(String[] args) {
      UserDAO userDAO = new UserDAO();
      
      System.out.println(userDAO.checkId("kai687912"));
      
      
      //회원가입
//      UserVO userVO = new UserVO();
//      
//      userVO.setUserIdentification("kai687912");
//      userVO.setUserPassword("1234");
//      userVO.setUserName("손진혁");
//      userVO.setUserPhone("01064896879");
//      userVO.setUserEmail("kai6879@naver.com");
//      userVO.setUserRecommenderId("hds31234");
//      
//      userDAO.insert(userVO);
      
   }
}
