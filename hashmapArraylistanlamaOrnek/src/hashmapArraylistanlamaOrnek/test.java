package hashmapArraylistanlamaOrnek;

public class test {

	public static void main(String[] args) {
		oyuncuDunyas� dunya=new oyuncuDunyas�();
		oyuncu oyuncu1=new oyuncu("harun",14);
		dunya.oyuncuekle(oyuncu1);
	
		oyuncu oyuncu2=new oyuncu("selin",23);
		dunya.oyuncuekle(oyuncu2);
		oyuncu oyuncu3=new oyuncu("semiray",21);
		dunya.oyuncuekle(oyuncu3);
		dunya.oyuncular�goruntule();
		dunya.haritaolustur(oyuncu1.getYas(), oyuncu1.getName());
		dunya.haritaolustur(oyuncu2.getYas(), oyuncu2.getName());
		dunya.haritaolustur(oyuncu3.getYas(), oyuncu3.getName());
		//dunya.oyuncusil(oyuncu2);
		dunya.oyuncular�goruntule();
		dunya.belirlioyuncuyugoruntule(oyuncu3.getName());
		//dunya.belirlioyuncusil(oyuncu3.getName());
		dunya.oyuncular�goruntule();
		dunya.haritayazd�r();
		


	}

}
