class GameControl {

	Player player1 = new Player();
	Player player2 = new Player();

	DiceCup diceCup = new DiceCup();

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

		while (true) {
			game.playTurn(game.player1);
			if (game.checkWin(game.player1)) {
				break;
			}
			game.playTurn(game.player2);
			if (game.checkWin(game.player2)) {
				break;
			}
		}

	}

}
