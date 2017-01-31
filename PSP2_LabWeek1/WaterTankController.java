
public class WaterTankController {

	private static final int TANK_CAPACITY = 100;
	
	private int currentVolume;
	
	public WaterTankController(int initialVolume)
	{
		this.currentVolume = initialVolume;
	}
	
	public boolean addToTank(int amountToAdd)
	{
		if((this.currentVolume + amountToAdd) > TANK_CAPACITY)
		{
			return false;
		}
		else
		{
			this.currentVolume += amountToAdd;
			return true;
		}
	}
	
	public boolean removeFromTank(int amountToRemove)
	{
		if((this.currentVolume - amountToRemove) < 0)
		{
			return false;
		}
		else
		{
			this.currentVolume -= amountToRemove;
			return true;
		}
	}
	
	public int getCurrentTankVolume()
	{
		return this.currentVolume;
	}

}
