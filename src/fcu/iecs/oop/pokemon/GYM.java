package fcu.iecs.oop.pokemon;

public class GYM 
{
	public static Player fight(Player player,Player players)
	{
		int win[] = {0,0};
		int i;
		int num = (int)(Math.random()*2+1);
		Player Winner = new Player("0");
		Pokemon[] pkm1 = player.getPokemons();
		Pokemon[] pkm2 = players.getPokemons();
		
		
		
		for(i=0;i<=2;i++)
		{
			if(pkm1[i].getType() == PokemonType.WATER && pkm2[i].getType() == PokemonType.WATER)
			{
				if(pkm1[i].CP > pkm2[i].CP)
				{
					win[0]++;
				}
				else if(pkm1[i].CP < pkm2[i].CP)
				{
					win[1]++;
				}
				else if(pkm1[i].CP == pkm2[i].CP)
				{
					if(num == 1)
					{
						win[0]++;
					}
					
					else if(num == 2)
					{
						win[1]++;
					}
				}
			}
			
			else if(pkm1[i].getType() == PokemonType.FIRE && pkm2[i].getType() == PokemonType.FIRE)
			{
				if(pkm1[i].CP > pkm2[i].CP)
				{
					win[0]++;
				}
				else if(pkm1[i].CP < pkm2[i].CP)
				{
					win[1]++;
				}
				else if(pkm1[i].CP == pkm2[i].CP)
				{
					if(num == 1)
					{
						win[0]++;
					}
					
					else if(num == 2)
					{
						win[1]++;
					}
				}
			}	
			else if(pkm1[i].getType() == PokemonType.GRASS && pkm2[i].getType() == PokemonType.GRASS)
			{
				if(pkm1[i].CP > pkm2[i].CP)
				{
					win[0]++;
				}
				else if(pkm1[i].CP < pkm2[i].CP)
				{
					win[1]++;
				}
				else if(pkm1[i].CP == pkm2[i].CP)
				{
					if(num == 1)
					{
						win[0]++;
					}
					
					else if(num == 2)
					{
						win[1]++;
					}
				}
			}
			
			else if(pkm1[i].getType() == PokemonType.FIRE && pkm2[i].getType() == PokemonType.WATER)
			{
				win[1]++;
			}
			else if(pkm1[i].getType() == PokemonType.FIRE && pkm2[i].getType() == PokemonType.GRASS)
			{
				win[0]++;
			}
			else if(pkm1[i].getType() == PokemonType.WATER && pkm2[i].getType() == PokemonType.GRASS)
			{
				win[1]++;
			}
			else if(pkm1[i].getType() == PokemonType.WATER && pkm2[i].getType() == PokemonType.FIRE)
			{
				win[0]++;
			}
			else if(pkm1[i].getType() == PokemonType.GRASS && pkm2[i].getType() == PokemonType.WATER)
			{
				win[0]++;
			}
			else if(pkm1[i].getType() == PokemonType.GRASS && pkm2[i].getType() == PokemonType.FIRE)
			{
				win[1]++;
			}
		}
		
					if(win[0]>win[1])
					{
						player.level++;
						System.out.println("Winner is ["+player.Playername+"]and his level becomes ["+player.level+"].");
						Winner = player;
					}
					else if(win[0]<win[1])
					{
						players.level++;
						System.out.println("Winner is ["+players.Playername+"]and his level becomes ["+players.level+"].");
						Winner = players;
					}
					return Winner;
					
					
		
	}

}
