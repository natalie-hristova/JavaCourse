package lesson07;

public class Map {
	static final City center=new City("Tsarigrad",345,456);
	Roads roads[];
	City city[];

	 Map(int road,int city){
			this.roads=new Roads[road];
			this.city=new City[city];
	}
	 public void show(){
		 System.out.println();
	 }
}
