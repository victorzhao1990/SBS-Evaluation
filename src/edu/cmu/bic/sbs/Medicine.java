package edu.cmu.bic.sbs;

/**
 * The Medicine Class
 * @author Victor Zhao <xinyunzh@andrew.cmu.edu>
 *
 */
public class Medicine {
	private String medicine;
	
	private float dose;
	
	public float getDose() {
		return dose;
	}	
	
	public void setDose(float dose) {
		this.dose = dose;
	}
	
	public String getMed() {
		return medicine;
	}
	
	public void setMed(String medicine) {
		this.medicine = medicine.toString();
	}
	
	public String toString() {
		return "The medicine is " + getMed();
	}
	
	Medicine() {
		medicine = new String();
	}
}
