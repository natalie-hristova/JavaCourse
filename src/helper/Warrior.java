package helper;


public class Warrior extends Hero {

	public Warrior(byte attack, byte defence, byte special) {
		super(attack, defence, special);
	}

	@Override
	public byte getAttack(Hero h) {
		return attack;
	}

	@Override
	public byte getDefence(Hero attacker) {
		return attacker instanceof Barbarian ?
				add(defence, special) : defence;
	}

}
