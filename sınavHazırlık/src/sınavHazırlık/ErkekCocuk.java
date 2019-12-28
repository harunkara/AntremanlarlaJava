package sýnavHazýrlýk;

public class ErkekCocuk extends Aile {
	String erkekcocukisim;

	public ErkekCocuk(String soyad3,String isim) {
		super(soyad3);
		this.erkekcocukisim=isim;
		
		
	}

	public String getErkekcocukisim() {
		return erkekcocukisim;
	}

	public void setErkekcocukisim(String erkekcocukisim) {
		this.erkekcocukisim = erkekcocukisim;
	}
	public String toString() {
		return super.toString()+erkekcocukisim;
	}
	
	

}
