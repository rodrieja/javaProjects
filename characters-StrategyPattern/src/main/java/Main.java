
public class Main {

	public static void main(String[] args) {
		Character warrior = new Warrior();
		warrior.setArmor(new LeatherArmorBehaivor());
		warrior.setWeapon(new SwordBehaivor());

		warrior.figth();
		
		Character wizard = new Wizard();
		wizard.setArmor(new NoArmorBehaivor());
		wizard.setWeapon(new WandBehaivor());
		
		wizard.figth();
	}

}
