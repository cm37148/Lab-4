package lab4;

public class PlayableCharacter {
	

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
	//class fields
    private String name;
    private int currentHitPoints = 10;
    private int weaponDamage = 5;
    private int locationX = 0;
    private int locationY = 0;
    
    //Lower our current hitpoints by the damageTaken argument
    public void receiveDamage(int damageTaken) {
    	 this.currentHitPoints -= damageTaken;
    }
    //Object interaction. The parameter is an Enemy object
    //We call the enemy's receiveDamage method within this attackEnemy method
    public void attackEnemy(Enemy enemy) {
        enemy.receiveDamage(this.weaponDamage);
    }
    public String toString() {
        //%s means String
        //%d means decimal number (integer)
        return String.format("%s location: %d, %d. HitPoints: %d\n", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
    }
    public boolean equals(Object other) {
        //Cast the Object parameter to a PlayableCharacter so we can access its name
        //If the name of the current PlayableCharacter equals the other PlayableCharacter being passed as a parameter, return true. Else, return false.
        PlayableCharacter tempCast = (PlayableCharacter)other;
        if (this.name.equals(tempCast.getName())){ 
            return true;
        }
        else {
            return false;
        }
    }
    public PlayableCharacter(String name) {
        this.name = name; 
    }
    
}

