package day54;

public class SoccerClub {

	int playerCount;
	String name;
	Stadium st;
	
	public SoccerClub(int playerCount, String name, Stadium stadium) {
//		super();
		this.playerCount = playerCount;
		this.name = name;
		this.st = stadium;
	}
	
	public int getStadiumCapacity() {
		return st.capacity;
	}

	public char getInitial() {
		return name.charAt(0);
	}

	public int getStadiumCapacity() {
		return st.capacity;
	}
	
	
	public int getPlayerCount() {
		return playerCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + stadium + "]";
	}
	
	
	public static void main(String[] args) {
	
		Stadium st= new Stadium(1000, "Burger");
		
		System.out.println(st);
		
		SoccerClub Dinamo= new SoccerClub(12, "Dinamo", st);

		System.out.println(Dinamo);
		
	
	}
	
	
	
}
