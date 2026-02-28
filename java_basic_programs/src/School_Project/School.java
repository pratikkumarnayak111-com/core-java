package School_Project;

import java.io.Serializable;

public class School implements Serializable{
	private static final long SerialVersionUID=1l;
	
	private String sname;
	private int sno;
	private String SFname;
	private String Address;
	transient long Spassword;
	
/*public School() {
		
	}
	public School(String sname, int sno, String sFname, String address, long spassword) {
		super();
		this.sname = sname;
		this.sno = sno;
		this.SFname = sFname;
		this.Address = address;
		this.Spassword = spassword;
	}*/
	public School() {
		
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSFname() {
		return SFname;
	}
	public void setSFname(String sFname) {
		SFname = sFname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getSpassword() {
		return Spassword;
	}
	public void setSpassword(long spassword) {
		Spassword = spassword;
	}
	@Override
	public String toString() {
		return "School [sname=" + sname + ", sno=" + sno + ", SFname=" + SFname + ", Address=" + Address + "]";
	}
	
	
}
