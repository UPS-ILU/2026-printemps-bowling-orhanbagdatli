package tdd;

public class Game {
	private int score = 0;
	
	public void roll(int nbQuilles) {
		score += nbQuilles;
	}
	
	public int score() {
		return score;
	}
}
