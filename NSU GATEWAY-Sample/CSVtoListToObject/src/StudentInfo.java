
public class StudentInfo {
	String id;
	String name;
	String credit;
	StudentInfo(String id,String name,String credit){
		this.id=id;
		this.name=name;
		this.credit=credit;
	}
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		
		return id+ " "+name+" " +credit ;
	}
}
