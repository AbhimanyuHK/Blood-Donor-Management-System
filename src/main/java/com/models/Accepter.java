/**
 * 
 */
package com.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author abhimanyu
 *
 */
@Entity
public class Accepter {

	private int id;
	private String patiantName;
	private String disease;
	private String status;
	private String bloodGroup;
	private int contactNumber;
	private String guardianName;
	private String hospetal;
	private String hospetalLocation;
	private String hospetalAddress;
	private String docterName;

	public Accepter(int id, String patiantName, String disease, String status, String bloodGroup, int contactNumber,
			String guardianName, String hospetal, String hospetalLocation, String hospetalAddress, String docterName) {
		super();
		this.id = id;
		this.patiantName = patiantName;
		this.disease = disease;
		this.status = status;
		this.bloodGroup = bloodGroup;
		this.contactNumber = contactNumber;
		this.guardianName = guardianName;
		this.hospetal = hospetal;
		this.hospetalLocation = hospetalLocation;
		this.hospetalAddress = hospetalAddress;
		this.docterName = docterName;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatiantName() {
		return patiantName;
	}

	public void setPatiantName(String patiantName) {
		this.patiantName = patiantName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getHospetal() {
		return hospetal;
	}

	public void setHospetal(String hospetal) {
		this.hospetal = hospetal;
	}

	public String getHospetalLocation() {
		return hospetalLocation;
	}

	public void setHospetalLocation(String hospetalLocation) {
		this.hospetalLocation = hospetalLocation;
	}

	public String getHospetalAddress() {
		return hospetalAddress;
	}

	public void setHospetalAddress(String hospetalAddress) {
		this.hospetalAddress = hospetalAddress;
	}

	public String getDocterName() {
		return docterName;
	}

	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}

}
