package kodlamaIo.entities;

public class Educator {
	private int id;
	private String educatorName;
	private String educatorSurname;
	
	public Educator() {
		super();
	}


	
	public Educator(int id, String educatorName, String educatorSurname) {
		super();
		this.id = id;
		this.educatorName = educatorName;
		this.educatorSurname = educatorSurname;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}

	public String getEducatorSurname() {
		return educatorSurname;
	}

	public void setEducatorSurname(String educatorSurname) {
		this.educatorSurname = educatorSurname;
	}
	
	
	
	

}
