class Player {
	private int point = 0;
	private String name;

	public String getName(){
		return name;
	}
	public void setName(String nameToSet){
		name = nameToSet;
	}

	public int getPoints(){
		return point;
	}

	public void setPoints(int Score){
		point = Score;
	}

	public void addPoints(int toBeAdded){
		point += toBeAdded;
	}


}
