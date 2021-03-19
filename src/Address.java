
public class Address {
	
	String HouseNo;
	String Locality;
	String District;
	String State;
	
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	
	public Address(String houseNo, String locality, String district, String state) {
		super();
		HouseNo = houseNo;
		Locality = locality;
		District = district;
		State = state;
		
	}
	

}
