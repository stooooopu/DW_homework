```java 

import java.util.List;

public class UserService {
    //1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
    public List<UserVO> updateSal(List<UserVO> list, String dname){
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i).getDname().equals(dname)) {
    			int x = list.get(i).getSal();
    			list.get(i).setSal(x*2);
    		}
    	}
    	return list;
    }
    //2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
    public List<UserVO> updateLv(List<UserVO> list){
    	for(UserVO vo : list) {
    		if(vo.getSal()<=100) {
    			vo.setLv(1);
    			continue;
    		}if(vo.getSal()<=1000) {
    			vo.setLv(2);
    			continue;
    		}else {
    			vo.setLv(3);
    		}
    	}
    	
        return list;
    }
    //3. 레벨 3이상 직원을 모두 해고하시오.
    public List<UserVO> deleteUser(List<UserVO> list, int lv){
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i).getLv()==lv) {
    			list.remove(i);
    		}
    	}
        return list;
    }
    //4. 이름이 King인 직원의 모든 정보 조회.
    public UserVO selectUserByEname(List<UserVO> list, String ename){
    	UserVO king = null;
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i).getEname().equals(ename)) {
    			king = list.get(i);
    		}
    	}
        return king;
    }
}
