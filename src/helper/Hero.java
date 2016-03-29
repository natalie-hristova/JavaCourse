package helper;


public abstract class Hero {

	protected byte add (int a, int b) {
		int sum = a + b;
		return sum > 127 ? 127 : (byte) sum;
	}
	
	
	private byte health;
	protected byte attack;
	protected byte defence;
	protected byte special;
	
	public Hero(byte attack, byte defence, byte special){
		health = 127;
		this.attack = attack;
		this.defence = defence;
		this.special = special;
	}
	
	public void takeAttack(Hero attacker){
		System.out.println(attacker + " attacks " + this);
		byte att = (byte) (attacker.getAttack(this) -
							this.getDefence(attacker));
		att = att < 1 ? 1 : att;
		health -= att;
		health = health < 0 ? 0 : health;
	}
	
	public byte getHealth(){
		return health;
	}
	
	public String toString(){
		return getClass().getSimpleName() + "(" + health + ")";
	}
	
	public abstract byte getAttack(Hero h);
	
	public abstract byte getDefence(Hero h);
}
