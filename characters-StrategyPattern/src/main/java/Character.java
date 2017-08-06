
public abstract class Character {
	protected WeaponBehaivor weaponBehaivor;
	protected ArmorBehaivor armorBehaivor;

	public void figth() {
		System.out.println("I'm fighting using: " + armorBehaivor.display() + " and " + weaponBehaivor.display());
	}

	public void setWeapon(WeaponBehaivor weaponBehaivor) {
		this.weaponBehaivor = weaponBehaivor;
	}

	public void setArmor(ArmorBehaivor armorBehaivor) {
		this.armorBehaivor = armorBehaivor;
	}
}
