package fcu.iecs.oop.pokemon;

public class Player 
{
	public String Playername;
	private Pokemon[] pokemons;
	public int level = 1;
	
	
		public Player(String playername) 
		{
			super();
			Playername = playername;
		}
		
			public String getPlayername() 
			{
				return Playername;
			}
			public void setPlayername(String playername) 
			{
				Playername = playername;
			}
			
				public Pokemon[] getPokemons() 
				{
					return pokemons;
				}
				public void setPokemons(Pokemon[] pokemons) 
				{
					this.pokemons = pokemons;
				}
				
					public int getLevel() 
					{
						return level;
					}
					public void setLevel(int level) 
					{
						this.level = level;
					}
				
		
	
	
}
