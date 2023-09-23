class Player {

	private String name;
	private int points;

	// Constructor
	public Player() {
		this.name = "";
		this.points = 0;
	}

	// Constructor with name overload
	public Player(String givenName) {
		this.name = givenName;
		this.points = 0;
	}

	// Constructor with name and point overload
	public Player(String givenName, int startPoints) {
		this.name = givenName;
		this.points = startPoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String nameToSet) {
		this.name = nameToSet;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int score) {
		this.points = score;
	}

	public void addPoints(int toBeAdded) {
		this.points += toBeAdded;
	}

}
