class GameControl {

	Player player1 = new Player();
	Player player2 = new Player();

	DiceCup diceCup = new DiceCup();

	public void playGame() {

		while (true) {
			playTurn(player1);
			if (checkWin(player1)) {
				System.out.println(player1.getName());
				break;
			}
			playTurn(player2);
			if (checkWin(player2)) {
				break;
			}
		}

	}

	public void playTurn(Player player) {

		diceCup.rollDice();
		var sum = diceCup.getSum();

		System.out.println("you rolled " + sum);

		player.addPoints(sum);

		System.out.println("Your total points are " + player.getPoints());

	}

	public boolean checkWin(Player player) {

		return player.getPoints() >= 40;

	}

	public static void main(String[] args) {

		var game = new GameControl();
		game.playGame();

	}

}
