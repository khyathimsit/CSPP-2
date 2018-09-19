class User {
	String userName;
	List<String> friends;
	
	User(String user) {
		userName = user;
		this.friends = null;
	}

	User(String user, List<String> friends) {
		this.userName = user;
		this.friends = friends;
	}
	
	public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public List<String> getFriends() {
    	return friends;
    }

    public void setFriends(List<String> friends) {
    	this.friends = friends;
    }

    public boolean equals(Object object) {
    	User u = (User) object;
    	return u.getUserName().equals(this.getUserName());
    }

    public String toString() {
    	StringBuffer sb = new StringBuffer();
    	sb.append(this.getUserName() + ": [");
    	for(int i = 0;i < friends.size() - 1; i++) {
    		sb.append(friends.get(i) + ", ");
    	}
    	sb.append(friends.get(friends.size() - 1) + "], ");
    	return sb.toString();
    }
}
