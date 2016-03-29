package helper;


public class SomeClass {
	
	private static boolean attack(Hero attacker, Hero defender){
		
		int turn = 0;
		while(attacker.getHealth() > 0 && defender.getHealth() > 0){
			if(turn % 2 == 0){
				defender.takeAttack(attacker);
			} else {
				attacker.takeAttack(defender);
			}
			turn++;
		}
		return attacker.getHealth() > 0;
	}

	public static void main(String[] args){
		Hero[] army1 = new Hero[]{
				new Warrior((byte)20, (byte)10, (byte)5),
				new Archer((byte)16, (byte)15, (byte)2),
				new Barbarian((byte)23, (byte)14, (byte)6)
		};
		Hero[] army2 = new Hero[]{
				new Archer((byte)11, (byte)12, (byte)8),
				new Warrior((byte)22, (byte)9, (byte)10),
				new Barbarian((byte)17, (byte)16, (byte)4),
				new Archer((byte)15, (byte)14, (byte)6),
		};
		
		int i = 0, j = 0;
		while(i < army1.length && j < army2.length){
			Hero a = army1[i];
			Hero d = army2[j];
			if(attack(a, d)){
				j++;
			} else {
				i++;
			}
			System.out.println("Our hero has fallen");
		}
	}
}
