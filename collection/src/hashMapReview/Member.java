package hashMapReview;

public class Member {
	private int id;			//���̵�
	private String name;	//�̸�
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return name;
	}

	public void setNama(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
