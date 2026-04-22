package tdd;

public class Game {
	private int roll = 0;
	private int[] rolls = new int[21];
	
	public void roll(int nbQuilles) {
		rolls[roll] = nbQuilles;
		roll++;
	}
	
	public int score() {
		int score = 0;
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if(isSpare(rollIndex)) {
				score += 10 + rolls[rollIndex+2];
				rollIndex+=2;
			}else {
				score += rolls[rollIndex] + rolls[rollIndex+1];
				rollIndex+=2;
			}
			
		}
		return score;
	}
	
	private boolean isSpare(int rollIndex) {
		
		return rolls[rollIndex] + rolls[rollIndex+1] == 10;
	}
	
	
}
