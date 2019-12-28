package sýnavHazýrlýk;

public class Aile {
	private String soyad="kara";	


	public Aile(String soyad) {
		this.soyad = soyad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

public String toString() {
	return soyad+"    ";
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErkekTorun trn=new ErkekTorun("kara","harun","hasan");
		System.out.println(trn);

	}

}
