class GameControl {

	Player player1 = new Player();
	Player player2 = new Player();

	DiceCup diceCup = new DiceCup();

	public void playTurn(Player player){

		diceCup.rollDice();
		var sum = diceCup.getSum();

		System.out.println("you rolled " + sum);

		player.addPoints(sum);

		System.out.println("Your total points are " + player.getPoints());

	}

	public boolean checkWin(Player player){

		if (player.getPoints() >= 40){
			System.out.println(player.getName() + " wins");
		}

	}

	public static void main(String[] args) {



	}
}
