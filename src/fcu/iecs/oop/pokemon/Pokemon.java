package fcu.iecs.oop.pokemon;

public class Pokemon 
{
	private String name;
	public int CP;
	private PokemonType type;
	
	
	
	
			public String getName() 
			{
				return name;
			}
			
			
				public PokemonType getType() 
				{
					return type;
				}
				
					public int getCP() 
					{
						return CP;
					}
					public void setCP(int cP) 
					{
						CP = cP;
					}
				

						public Pokemon(String name, int cP, PokemonType type) 
						{
							super();
							this.name = name;
							this.type = type;
							CP = cP;
							
						}
	
	
	
}
