package com.journaldev.spring.hb.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE")
public class Trainee {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "TRAINEE_SEQ", allocationSize=1, initialValue=1)
	private int id;
	
	private String userID;
	private String userType;
	private String title;
	private String aadharNo;
	private String fName;
	private String mName;
	private String lName;
	private String empID;
	private String dob;
	private String fatherName;
	private String gender;
	private String cAddress1;
	private String cAddress2;
	private int cState;
	private int cDistrict;
	private int cCity;
	private String cPincode;
	private String cMobile;
	private String cEmail;
	private String pAddress1;
	private String pAddress2;
	private int pState;
	private int pDistrict;
	private int pCity;
	private String pPincode;
	/*private String expBG;
	private String yFSEmp;
	private String mFSEmp;
	private String monSession;
	private String sessionConducted;
	private String ZTrainingInstitute_ID;
	private String ZTrainer_ID;*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getcAddress1() {
		return cAddress1;
	}
	public void setcAddress1(String cAddress1) {
		this.cAddress1 = cAddress1;
	}
	public String getcAddress2() {
		return cAddress2;
	}
	public void setcAddress2(String cAddress2) {
		this.cAddress2 = cAddress2;
	}
	public int getcState() {
		return cState;
	}
	public void setcState(int cState) {
		this.cState = cState;
	}
	public int getcDistrict() {
		return cDistrict;
	}
	public void setcDistrict(int cDistrict) {
		this.cDistrict = cDistrict;
	}
	public int getcCity() {
		return cCity;
	}
	public void setcCity(int cCity) {
		this.cCity = cCity;
	}
	public String getcPincode() {
		return cPincode;
	}
	public void setcPincode(String cPincode) {
		this.cPincode = cPincode;
	}
	public String getcMobile() {
		return cMobile;
	}
	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getpAddress1() {
		return pAddress1;
	}
	public void setpAddress1(String pAddress1) {
		this.pAddress1 = pAddress1;
	}
	public String getpAddress2() {
		return pAddress2;
	}
	public void setpAddress2(String pAddress2) {
		this.pAddress2 = pAddress2;
	}
	public int getpState() {
		return pState;
	}
	public void setpState(int pState) {
		this.pState = pState;
	}
	public int getpDistrict() {
		return pDistrict;
	}
	public void setpDistrict(int pDistrict) {
		this.pDistrict = pDistrict;
	}
	public int getpCity() {
		return pCity;
	}
	public void setpCity(int pCity) {
		this.pCity = pCity;
	}
	public String getpPincode() {
		return pPincode;
	}
	public void setpPincode(String pPincode) {
		this.pPincode = pPincode;
	}
}
