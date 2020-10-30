//Kendaraan.java
package uts.pck1;
public abstract class Kendaraan{
	//atribut
	protected String merk;
	protected String warna;
		
	public abstract void setMerk(String merk);
	public abstract void setWarna(String warna);
	public abstract String getMerk( );
	public abstract String getWarna( );
}