package pt.c40task.l05wumpus;

public class PrintUtils {
	// Possibilidade de melhoria: nao deixar fixas as dimensoes 4x4 da caverna
	public static void caveState(char[][] caverna) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
               System.out.print(caverna[i][j] + ((j != 3) ? ", " : "\n"));         }
    }
	
	public static void displayName(String playerName) {
		System.out.println("Player: " + playerName);
	}
	
	public static void displayScore(int score) {
		System.out.println("Score: " + score);
	}
	
	public static void displayMessage(String message) {
		System.out.println(message);
	}
	
}
