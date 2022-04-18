```java 

package user;

import java.util.ArrayList;
import java.util.List;

public class MainController extends UserService {

	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));
        
        MainController main = new MainController();
        for(UserVO vo : main.updateSal(list, "DEVELOP")) {
        	System.out.println(vo.getSal());
        }
        for(UserVO vo : main.updateLv(list)) {
        	System.out.println(vo.getLv());
        }
        for(UserVO vo : main.deleteUser(list, 3)) {
        	System.out.println(vo.getLv());
        }
        UserVO king = main.selectUserByEname(list, "King");
        System.out.println(king.getEname()+","+king.getDname()+", "+king.getLv()+", "+
        king.getSal());
	}

}
