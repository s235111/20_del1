class GameControl {

	Player player1 = new Player();
	Player player2 = new Player();

	DiceCup diceCup = new DiceCup();

	public void playGame() {
		// This function makes use of ANSI escape codes to move the
		// cursor around, clear lines, and to do a bit of formatting

		boolean isPlayerTwo = false;
		Player currentPlayer;
		var scanner = new java.util.Scanner(System.in);

		try {
			// Ask the user for the player names
			System.out.print("Player 1 name: ");
			player1.setName(scanner.nextLine());
			System.out.print("Player 2 name: ");
			player2.setName(scanner.nextLine());

			// Clear the previous two lines and move the cursor back up
			System.out.print("\033[A\033[K\033[A\033[K");

			// The format string used to print player info
			// The first part clears the line to remove any previous text
			var formatString = "\033[K\033[%sm%-" + Math.max(
					player1.getName().length(),
					player2.getName().length()) + "s\033[m    %3d%s";

			// Write the text at the bottom telling the player how to roll
			System.out.print(System.lineSeparator().repeat(6));
			System.out.print("Press [Enter] to roll\033[5F");
			while (true) {
				currentPlayer = isPlayerTwo ? player2 : player1;

				// Write out the player info (name, points, whether it's their turn)
				System.out.format(formatString + "%n",
						isPlayerTwo ? "35" : "95",
						player1.getName(), player1.getPoints(),
						isPlayerTwo ? "" : "    Your turn!");
				System.out.format(formatString + "%n%n",
						!isPlayerTwo ? "34" : "94",
						player2.getName(), player2.getPoints(),
						!isPlayerTwo ? "" : "    Your turn!");

				// Wait for the player to press Enter
				scanner.nextLine();
				// Make sure to clear any text they may have written
				System.out.print("\033[A\033[K");
				// Colour the name in the text saying what the player just rolled
				System.out.print("\033[" + (!isPlayerTwo ? "35" : "34") + "m");

				playTurn(currentPlayer);

				// Move back up to the first line of player info
				System.out.print("\033[3F");

				if (checkWin(currentPlayer)) {
					// Rewrite the player info to show what the final points are
					// Also write a "You won!" instead of "Your turn!"
					var won = "    \033[32mYou won!\033[m";
					var lost = "    \033[31mYou lost!\033[m";
					System.out.format(formatString + "%n", "35",
							player1.getName(), player1.getPoints(),
							isPlayerTwo ? lost : won);
					System.out.format(formatString + "%n%n", "34",
							player2.getName(), player2.getPoints(),
							!isPlayerTwo ? lost : won);
					// Move down to the "Press [Enter] to roll" line and clear it,
					// allowing the shell prompt, if present, to appear at that line
					System.out.print("\033[2E\033[K");
					break;
				}

				isPlayerTwo = !isPlayerTwo;
			}
		} catch (java.util.NoSuchElementException e) {
			// This happens when you press Ctrl+C
			// Simply ignore the exception in this case
		} catch (Exception e) {
			System.err.println("\033[J\033[31mSomething went wrong\033[m");
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

	public void playTurn(Player player) {

		diceCup.rollDice();
		var sum = diceCup.getSum();

		System.out.format("%s\033[m rolled a %d and %d (=%d)",
				player.getName(), diceCup.die1.getValue(), diceCup.die2.getValue(), sum);

		player.addPoints(sum);

	}

	public boolean checkWin(Player player) {

		return player.getPoints() >= 40;

	}

	public static void main(String[] args) {

		var game = new GameControl();
		game.playGame();

	}

}
