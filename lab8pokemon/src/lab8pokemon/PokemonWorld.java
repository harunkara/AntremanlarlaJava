package lab8pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PokemonWorld extends Pokemon {
	ArrayList<Pokemon> Pokemon = new ArrayList<Pokemon>();

	HashMap<Integer, String> hmap = new HashMap<Integer, String>();


	public PokemonWorld(int id, int total, int hp, int attack, int defense, int speed, int generation, String name,
			String type1, String type2, boolean legendary) {
		super(id, total, hp, attack, defense, speed, generation, name, type1, type2, legendary);
	}
	public PokemonWorld() {super();};

	public void addelementstolist(Pokemon poke) {
		Pokemon.add(poke);

	}

	public void removeelementsfromlist(int pokeid) {
		Pokemon.remove(pokeid-1);
	}

	public void Pokemonsize() {
		System.out.println(Pokemon.size());
	}

	public void printallPokemon() {
		for (int t = 0; t < Pokemon.size(); t++)
			System.out.println(Pokemon.get(t));

	}

	public void addpokemontomap(int id, String name) {
		hmap.put(id, name);

	}

	public void printallpokemonmaps(Pokemon Pokemon) {
		System.out.println(hmap.values());

	}

	public void removepokemonfrommap(int id) {
		hmap.remove(id);
	}


}
