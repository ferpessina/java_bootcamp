public class TwentyOneSticks {

	public static void main(String[] args) {
		GameSticks sticks = new GameSticks();
		Player player1 = new Player(true);
		Player player2 = new Player(true);
		
		System.out.println("Game Start!");
		
		while (sticks.remaining_sticks() > 0) {
			System.out.println("Player 1 turn:");
			if (sticks.take(player1.play(sticks.remaining_sticks())) <= 0) {
				System.out.println("Player 2 wins!! \nPlayer 1 is the loser...");
			} else {
				System.out.println("Player 2 turn:");
				if (sticks.take(player2.play(sticks.remaining_sticks())) <= 0) {
					System.out.println("Player 1 wins!! \nPlayer 2 is the loser...");
				}
			}
		}
	}
}
