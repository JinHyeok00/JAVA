package arrayListTask.user;

public class User {
	
	private String name;		//�̸�
	private String id;			//���̵�
	private String passWord;	//��й�ȣ
	private String phoneNumber;	//��ȭ��ȣ
	
	public User() {;}	//�⺻������
	
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
