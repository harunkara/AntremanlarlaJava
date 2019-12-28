package lab8pokemon;

public class test {

	public static void main(String[] args) {
		PokemonWorld poke=new PokemonWorld();
		PokemonWorld pk=new PokemonWorld(1,45,89,90,15,34,7,"pokemon1","her","sa",true);
		poke.addelementstolist(pk);
		PokemonWorld pk2=new PokemonWorld(2,45,89,90,15,34,7,"pokemon2","her","sa",true);
		poke.addelementstolist(pk2);
		PokemonWorld pk3=new PokemonWorld(3,45,89,90,15,34,7,"pokemon3","her","sa",true);
		poke.addelementstolist(pk3);
		PokemonWorld pk4=new PokemonWorld(4,45,89,90,15,34,7,"pokemon4","her","sa",true);
		poke.addelementstolist(pk4);
		PokemonWorld pk5=new PokemonWorld(5,45,89,90,15,34,7,"pokemon5","her","sa",true);
		poke.addelementstolist(pk5);
		PokemonWorld pk6=new PokemonWorld(6,45,89,90,15,34,7,"pokemon6","her","sa",true);
		poke.addelementstolist(pk6);
		PokemonWorld pk7=new PokemonWorld(7,45,89,90,15,34,7,"pokemon7","her","sa",true);
		poke.addelementstolist(pk7);
		PokemonWorld pk8=new PokemonWorld(8,45,89,90,15,34,7,"pokemon8","her","sa",true);
		poke.addelementstolist(pk8);
		PokemonWorld pk9=new PokemonWorld(9,45,89,90,15,34,7,"pokemon9","her","sa",true);
		poke.addelementstolist(pk9);
		PokemonWorld pk10=new PokemonWorld(10,45,89,90,15,34,7,"pokemon10","her","sa",true);
		poke.addelementstolist(pk10);
		poke.printallPokemon();
		poke.Pokemonsize();
		poke.removeelementsfromlist(1);
		poke.printallPokemon();
		poke.Pokemonsize();
		poke.addpokemontomap(7, "pokemon7");
		poke.addpokemontomap(8, "pokemon8");
		poke.addpokemontomap(9, "pokemon9");
		poke.printallpokemonmaps(poke);
		poke.removepokemonfrommap(7);
		poke.printallpokemonmaps(poke);
		
		//System.out.println(p)
	}

}
