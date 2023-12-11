package arrayListTask.user;

public class User {
	
	private String name;		//이름
	private String id;			//아이디
	private String passWord;	//비밀번호
	private String phoneNumber;	//전화번호
	
	public User() {;}	//기본생성자
	
	@Override
	public String toString() {
		return id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			return id.equals(((User) obj).id);
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
