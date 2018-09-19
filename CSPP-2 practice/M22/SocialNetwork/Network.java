import java.util.Arrays;
import java.util.ArrayList;
class Network {
	List<User> userList;

	public Network() {
		userList = new List<User>();
	}

	public void addNewUser(String username, List<String> connections) {
		if (userList.size() == 0) {
			userList.add(new User(username, connections));
		} else {
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getUserName().equals(username)) {
					System.out.println("User already exists!!");
					return;	
		   		}
			}
        }
        userList.add(new User(username, connections));
	}

	public void addConnection(String user, String friend) {
		int index = userList.indexOf(new User(user));
		if (index == -1) {
			System.out.println("Not a user in Network");
			return;
		} else {
			if (userList.get(index).getUserName().contains(friend) == false) {
				userList.get(index).getFriends().add(friend);
			}
		}
	}
		
	public List<String> getConnection(String uname) {
		int index = userList.indexOf(new User(uname));
		if (index != -1) {
			return userList.get(index).getFriends();
		}
		return null;
	}

	public List getCommonConnections(String user, String user1) {
		List<String> common = new List<String>();
		List<String> friendsListA = getConnection(user);
		List<String> friendsListB = getConnection(user1);
		for (int i = 0; i < friendsListA.size(); i++) {
			if (friendsListB.contains(friendsListA.get(i))) {
				common.add(friendsListA.get(i));
			}
		}
		return common;
    }

	public String toString() {
		StringBuffer s = new StringBuffer();
		ArrayList list = new ArrayList();
		for (int i = 0; i < userList.size(); i++) {
			list.add(userList.get(i).getUserName());
		}
		java.util.Collections.sort(list);
		for (int i = 0; i < userList.size(); i++) {
			int index = userList.indexOf(new User((String)list.get(i)));
			s.append(userList.get(index));
		}
		String string = s.toString();
		return string.substring(0, string.length() - 2);
	}
}
