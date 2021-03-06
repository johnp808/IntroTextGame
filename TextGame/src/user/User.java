package user;

import java.util.Objects;
import art.Color;

public class User {

	Color color = new Color();
	
	String name;
	String gender;
	int age;
	String aI = "\033[1;93m" + "Keali`i" + "\033[0m";
	int health = 100; 
	String weapon = "Unarmed";
	int weaponStrength = 0;
	int attackStrength = 2;
	int totalAttack = 2;
	String spell = "None";
	int mana = 100;
	int spellStrength = 0;
	int spellConsumption = 0;
	
	public void stats() {
		System.out.println("                                ");		
		System.out.println("            "+"  Name: "+getName()+"                   ");		
		System.out.println("      	    HP: "+getHealth()+"                   ");		
		System.out.println("       	    MP: "+getMana()+"                   ");		
		System.out.println("     	    Spell: "+getSpell()+"                   ");		
		System.out.println("     	    Spell Str: "+getSpellStrength()+"                   ");		
		System.out.println("      	    Weapon: "+getWeapon()+"                   ");		
		System.out.println("     	    Weapon Str: "+getWeaponStrength()+"                   ");		
		System.out.println("     	    Attack Str: "+getAttackStrength()+"                   ");		
		System.out.println("     	    Total Atk: "+getTotalAttack()+"                   ");		
		System.out.println("                                ");	
	}
	
	public User() {
		super();
	}

	public User(String name, String gender, int age, String aI, int health, String weapon, int weaponStrength,
			int attackStrength, int totalAttack, String spell, int mana, int spellStrength, int spellConsumption) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.aI = aI;
		this.health = health;
		this.weapon = weapon;
		this.weaponStrength = weaponStrength;
		this.attackStrength = attackStrength;
		this.totalAttack = totalAttack;
		this.spell = spell;
		this.mana = mana;
		this.spellStrength = spellStrength;
		this.spellConsumption = spellConsumption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getaI() {
		return aI;
	}

	public void setaI(String aI) {
		this.aI = aI;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getWeaponStrength() {
		return weaponStrength;
	}

	public void setWeaponStrength(int weaponStrength) {
		this.weaponStrength = weaponStrength;
	}

	public int getAttackStrength() {
		return attackStrength;
	}

	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}

	public int getTotalAttack() {
		return totalAttack;
	}

	public void setTotalAttack() {
		this.totalAttack = this.weaponStrength + this.attackStrength;
	}

	public String getSpell() {
		return spell;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getSpellStrength() {
		return spellStrength;
	}

	public void setSpellStrength(int spellStrength) {
		this.spellStrength = spellStrength;
	}

	public int getSpellConsumption() {
		return spellConsumption;
	}

	public void setSpellConsumption(int spellConsumption) {
		this.spellConsumption = spellConsumption;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aI, age, attackStrength, gender, health, mana, name, spell, spellConsumption, spellStrength,
				totalAttack, weapon, weaponStrength);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(aI, other.aI) && age == other.age && attackStrength == other.attackStrength
				&& Objects.equals(gender, other.gender) && health == other.health && mana == other.mana
				&& Objects.equals(name, other.name) && Objects.equals(spell, other.spell)
				&& spellConsumption == other.spellConsumption && spellStrength == other.spellStrength
				&& totalAttack == other.totalAttack && Objects.equals(weapon, other.weapon)
				&& weaponStrength == other.weaponStrength;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", age=" + age + ", aI=" + aI + ", health=" + health
				+ ", weapon=" + weapon + ", weaponStrength=" + weaponStrength + ", attackStrength=" + attackStrength
				+ ", totalAttack=" + totalAttack + ", spell=" + spell + ", mana=" + mana + ", spellStrength="
				+ spellStrength + ", spellConsumption=" + spellConsumption + "]";
	}
	
}
