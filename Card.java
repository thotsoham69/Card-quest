
public class Card {
	
	private String color;
	private String effect;
	private int energy;
	private String type;
	private String name;
	
	public Card(String color, String effect, int energy, String type, String name)
	{
		this.color = color;
		this.effect = effect;
		this.energy = energy;
		this.type = type;
		this.name = name;
		
	}
	
	public void use()
	{
		
	}
	
	public String getEffect()
	{
		return effect;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setEnergy(int newEnergy)
	{
		energy = newEnergy;
	}
	
}
