package hashMapReview;

public class Member {
	private int id;			//아이디
	private String name;	//이름
	
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
