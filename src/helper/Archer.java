package helper;


public class Archer extends Hero {

	public Archer(byte attack, byte defence, byte special) {
		super(attack, defence, special);
	}

	@Override
	public byte getAttack(Hero h) {
		return h instanceof Warrior ?
				add(attack, special) : attack;
	}

	@Override
	public byte getDefence(Hero h) {
		return defence;
	}

}
