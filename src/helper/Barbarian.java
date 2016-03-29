package helper;


public class Barbarian extends Hero {

	public Barbarian(byte attack, byte defence, byte special) {
		super(attack, defence, special);
	}

	@Override
	public byte getAttack(Hero h) {
		return h instanceof Archer ?
				add(attack, special) : attack;
	}

	@Override
	public byte getDefence(Hero h) {
		return defence;
	}

}
