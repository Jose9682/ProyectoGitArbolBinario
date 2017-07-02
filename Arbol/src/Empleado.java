
public class Empleado implements Comparable<Empleado>{
	private Integer id;
	private String desc;
	private String desc2;
	private String desc3;
	
	
	public Empleado(Integer id, String desc, String desc2, String desc3) {
		super();
		this.id = id;
		this.desc = desc;
		this.desc2 = desc2;
		this.desc3 = desc3;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc2() {
		return desc2;
	}
	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}
	public String getDesc3() {
		return desc3;
	}
	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}
	@Override
	public int compareTo(Empleado empl) {
		// TODO Auto-generated method stub
		if (id == empl.id) {
			return 0;
		} else if (id < empl.id) {
			return -1;
		}else{
			return 1;
		}
		
	}
	
}
