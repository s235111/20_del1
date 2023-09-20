class Player {


	//Constructor
	public Player(){
		this.name = "";
		this.points = 0;
	}

	//Constructor with name overload
	public Player(String givenName){
		this.name = givenName;
		this.points = 0;
	}

	//Constructor with name and point overload
	public Player(String givenName, int startPoint){
		this.name = givenName;
		this.points = startPoint;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String nameToSet){
		this.name = nameToSet;
	}

	public int getPoints(){
		return this.point;
	}

	public void setPoints(int Score){
		this.point = Score;
	}

	public void addPoints(int toBeAdded){
		this.point += toBeAdded;
	}


}
