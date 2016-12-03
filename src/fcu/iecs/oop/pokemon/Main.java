package fcu.iecs.oop.pokemon;

public class Main 
{

	public static void main(String[] args) 
	{
		Player player1 = new Player("Player One");

	    Pokemon pkm11 = new Pokemon("Bulbasaur", 123,PokemonType.GRASS);
	    Pokemon pkm12 = new Pokemon("Charmander", 456, PokemonType.FIRE);
	    Pokemon pkm13 = new Pokemon("Psyduck", 89, PokemonType.WATER);

	      Pokemon[] pkms1 = { pkm11, pkm12, pkm13 };
	    player1.setPokemons(pkms1);
	    
	    Player player2 = new Player("Player Two");

	    Pokemon pkm21 = new Pokemon("Seel", 432, PokemonType.WATER);
	    Pokemon pkm22 = new Pokemon("Gyarados", 987, PokemonType.WATER);
	    Pokemon pkm23 = new Pokemon("Horsea", 89, PokemonType.WATER);

	      Pokemon[] pkms2 = { pkm21, pkm22, pkm23 };
	    player2.setPokemons(pkms2);
	    
	    GYM.fight(player1, player2);


	}

}
