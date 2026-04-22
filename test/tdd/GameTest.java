package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	
	Game game;
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void test_vide() {
		assertEquals(0, game.score());
	}

}
