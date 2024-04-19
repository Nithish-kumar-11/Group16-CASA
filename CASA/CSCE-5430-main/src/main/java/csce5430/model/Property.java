package csce5430.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // This tells Hibernate to make a table out of this class
public class Property {
	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getMlsId() {
		return mlsId;
	}

	public void settMlsId(String mlsId) {
		this.mlsId = mlsId;
	}

	@Column(name="property_description")
	private String propertyDescription;

	@Id
	@Column(name="MLS_ID")
	private String mlsId;

	@Column(name="full_address")
	private String address;	

	@Column(name="Subdivision_Name")
	private String subdivisionName;	
	
	@Column(name="square_feet")
	private String squareFeet;	
	
	@Column(name="Beds_Total")
	private String numberOfBedrooms;	

	@Column(name="Bath_Total")
	private String numberOfBathrooms;		
	
	@Column(name="Current_Price")
	private String price;			
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSubdivisionName() {
		return subdivisionName;
	}

	public void setSubdivisionName(String subdivisionName) {
		this.subdivisionName = subdivisionName;
	}

	public String getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(String squareFeet) {
		this.squareFeet = squareFeet;
	}

	public String getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(String numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public String getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(String numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setMlsId(String mlsId) {
		this.mlsId = mlsId;
	}

}
