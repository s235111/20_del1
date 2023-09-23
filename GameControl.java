class GameControl {

	Player player1 = new Player();
	Player player2 = new Player();

	DiceCup diceCup = new DiceCup();

	public void playGame() {

		boolean isPlayerTwo = false;
		Player currentPlayer;
		var scanner = new java.util.Scanner(System.in);

		try {
			while (true) {
				currentPlayer = isPlayerTwo ? player2 : player1;
				isPlayerTwo = !isPlayerTwo;

				playTurn(currentPlayer);
				System.out.println();
				if (checkWin(currentPlayer)) {
					System.out.println(currentPlayer.getName() + " won the game!");
					break;
				}
			}
		} catch (Exception e) {
			System.err.println("Something went wrong");
			System.err.print(e);
		} finally {
			scanner.close();
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
