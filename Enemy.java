package lab4;

public class Enemy {

	 //class fields
    private String name;
    private int currentHitPoints = 4;
    private int weaponDamage = 2;
    private int locationX = 0;
    private int locationY = 0;
	public Enemy(String string, int i, int j) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}
	public int getWeaponDamage() {
		return weaponDamage;
	}
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public void receiveDamage(int damageTaken) {
		 this.currentHitPoints -= damageTaken;
    }
    public void attackPlayableCharacter(PlayableCharacter player) {
    	player.receiveDamage(this.weaponDamage);
    }
    public String toString() {
    	return String.format("%s location: %d, %d. HitPoints: %d\n", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
    }   
    public boolean equals(Object other) {
    	Enemy tempCast = (Enemy)other;
        if (this.name.equals(tempCast.getName())){ 
            return true;
    }
        else {
            return false;
    }
    
}
}
