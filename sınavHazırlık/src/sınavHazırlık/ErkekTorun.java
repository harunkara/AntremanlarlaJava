package sýnavHazýrlýk;

public class ErkekTorun extends ErkekCocuk {

	private String torunisim;
	
	public ErkekTorun(String soyad,String isim,String torunisim) {
		super(soyad,isim);
	
		this.torunisim=torunisim;
	
	}
	public String getTorunisim() {
		return torunisim;
	}
	public void setTorunisim(String torunisim) {
		this.torunisim = torunisim;
	}
	public String toString() {
		return super.toString()/*getSoyad()+"  "+super.getErkekcocukisim()*/+"    "+torunisim;
	}
	

}
