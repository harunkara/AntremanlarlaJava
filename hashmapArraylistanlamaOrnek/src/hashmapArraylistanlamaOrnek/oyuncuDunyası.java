package hashmapArraylistanlamaOrnek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class oyuncuDunyas� extends oyuncu{
	List<oyuncu>oyuncular=new ArrayList<oyuncu>();
	HashMap<Integer,String>harita=new HashMap<Integer,String>();

	
	public oyuncuDunyas�(String name, int yas) {
		super(name, yas);
	}
	public oyuncuDunyas�(){super();}

	
	
	public void oyuncuekle(oyuncu kisi) {
		oyuncular.add(kisi);
	}
	
	public void oyuncusil(oyuncu kisi) {
		oyuncular.remove(kisi);
	}
	
	public void belirlioyuncusil(String name ) {
		for(int z=0;z<oyuncular.size();z++)
		{
			if(oyuncular.get(z).getName()==name)
				oyuncular.remove(z);
		}
		
	}
	public void oyuncular�goruntule() {
		for (int t = 0; t < oyuncular.size(); t++) {
			System.out.println(oyuncular.get(t));
			
			
	}
}
	
	public void belirlioyuncuyugoruntule(String name) {
		for (int t = 0; t < oyuncular.size(); t++) {
		if(oyuncular.get(t).getName()==name) {
			System.out.println("yuppi");
		}
		}
	}
	public void haritaolustur(int yas,String name) {
		harita.put(yas, name);
	}
	public void haritayazd�r() {
	         System.out.println(harita.values());

	
	}
}
